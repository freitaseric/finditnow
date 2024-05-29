package types

import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toLowerCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.nio.charset.Charset

class Command private constructor(val name: String, val path: String, val needSudo: Boolean = false) {
    companion object {
        suspend fun exec(executable: String, vararg args: String) = withContext(Dispatchers.IO) {
            try {
                val process = Runtime.getRuntime().exec(arrayOf(executable))
                val reader = process.inputReader(Charset.defaultCharset())
                val output = StringBuilder()

                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    output.append("$line\n")
                }

                process.waitFor()
                output.toString()
            } catch (e: Exception) {
                val name = executable.split("/")[0]
                "Error while trying to execute command($name): ${e.message}"
            }
        }

        suspend fun execAsSudo(executable: String, vararg args: String) = withContext(Dispatchers.IO) {
            if (!isSudoSupported()) throw Error("Sudo is not supported on your system!")

            try {
                val process = Runtime.getRuntime().exec(arrayOf("sudo", executable))
                val reader = process.inputReader(Charset.defaultCharset())
                val output = StringBuilder()

                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    output.append("$line\n")
                }

                process.waitFor()
                output.toString()
            } catch (e: Exception) {
                val name = executable.split("/")[0]
                "Error while trying to execute command($name): ${e.message}"
            }
        }

        private fun isSudoSupported(): Boolean {
            val os = System.getProperty("os.name").toLowerCase(Locale.current)

            return when {
                "linux" in os || "mac" in os -> true
                else -> false
            }
        }

        fun create(path: String, sudo: Boolean = false): Command {
            val name = path.split("/").last()
            return Command(name, path, sudo)
        }
    }

    fun run(vararg args: String) = runBlocking {
        if (needSudo) execAsSudo(path, *args) else exec(path, *args)
    }
}