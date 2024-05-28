import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import types.Command
import types.Environment
import types.Path
import utils.System
import java.lang.System.getenv

internal interface Configuration {
    var appImagesPath: Path
    var textEditor: Command
    var shellInterpreter: Command
    var network: NetworkConfiguration
}

class NetworkConfiguration(
    var allowedNetworkProtocols: MutableList<String>, var allowedSharingProtocols: MutableList<String>
)

class FindItNowConfiguration(
    override var appImagesPath: Path,
    override var textEditor: Command,
    override var shellInterpreter: Command,
    override var network: NetworkConfiguration,
) : Configuration

@Composable
fun rememberAppConfiguration() = remember {
    FindItNowConfiguration(
        appImagesPath = Environment.FIN_APPIMAGES_PATH,
        textEditor = Environment.FIN_EDITOR ?: getDefaultEditor(),
        shellInterpreter = Environment.FIN_SHELL ?: getDefaultShell(),
        network = NetworkConfiguration(
            allowedSharingProtocols = mutableListOf("smb", "ftp", "sftp"),
            allowedNetworkProtocols = mutableListOf("https")
        )
    )
}


private fun getDefaultEditor(): Command {
    return if (getenv("EDITOR") != null) Command.create(getenv("EDITOR")) else Command.create("nano")
}

private fun getDefaultShell(): Command {
    fun getEnvironmentShell(): String? = when {
        System.isWindows -> getenv("ComSpec")
        else -> getenv("SHELL")
    }

    val environmentShell = getEnvironmentShell()

    return environmentShell?.let { Command.create(it) } ?: when {
        System.isWindows -> Command.create("cmd.exe")
        else -> Command.create("/bin/sh")
    }
}