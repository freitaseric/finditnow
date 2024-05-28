import types.Command
import utils.OS

internal interface FindItNowConfig {
    var appImagesPath: String
    var textEditor: Command
    var network: NetworkConfiguration
    var shellInterpreter: Command
}

internal class NetworkConfiguration(
    var allowedNetworkProtocols: MutableList<String>, var allowedSharingProtocols: MutableList<String>
)

internal class FindItNowDefaultConfig private constructor(
    override var appImagesPath: String,
    override var textEditor: Command,
    override var network: NetworkConfiguration,
    override var shellInterpreter: Command
) : FindItNowConfig {
    companion object {
        fun init(): FindItNowConfig {
            return FindItNowDefaultConfig(
                appImagesPath = "\$HOME/.pin/AppImages",
                textEditor = Command.create("/usr/bin/nvim"),
                network = NetworkConfiguration(
                    allowedNetworkProtocols = mutableListOf("https"),
                    allowedSharingProtocols = mutableListOf("smb", "ftp", "sftp")
                ),
                shellInterpreter = this.getDefaultShellInterpreter()
            )
        }

        private fun getDefaultShellInterpreter(): Command {
            fun getEnvironmentShell(): String? = when {
                OS.isWindows() -> System.getenv("ComSpec")
                else -> System.getenv("SHELL")
            }

            val environmentShell = getEnvironmentShell()

            return environmentShell?.let { Command.create(it) } ?: when {
                OS.isWindows() -> Command.create("cmd.exe")
                else -> Command.create("/bin/sh")
            }
        }
    }
}

internal class FindItNowCustomConfig private constructor(
    override var appImagesPath: String,
    override var textEditor: Command,
    override var network: NetworkConfiguration,
    override var shellInterpreter: Command
) : FindItNowConfig {
    companion object {
        fun init(): FindItNowConfig {
            return FindItNowDefaultConfig.init()
        }
    }
}