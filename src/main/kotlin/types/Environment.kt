package types

data object Environment {
    val FIN_PATH = Path("\$HOME/.pin")
    val FIN_APPIMAGES_PATH = Path("\$PIN_PATH/AppImages")
    val FIN_CONFIG_PATH = Path("\$PIN_PATH/config.yml")

    var FIN_EDITOR: Command? = null
    var FIN_SHELL: Command? = null
}

class Path(private val value: String) {
    companion object {
        internal fun expand(input: String): String {
            val regex = Regex("""\$(\w+)""")
            return regex.replace(input) { match ->
                System.getenv(match.value) ?: ""
            }
        }
    }

    fun relative(from: String?): String {
        val cwd = expand(System.getProperty("user.dir"))

        val splitFrom = from?.split("/") ?: cwd.split("/")
        val splitTo = expand(value).split("/")

        var diffIndex = 0
        while (diffIndex < splitFrom.size && diffIndex < splitTo.size) {
            if (splitFrom[diffIndex] != splitTo[diffIndex]) break

            diffIndex++
        }

        val relativePath = StringBuilder()
        for (i in diffIndex until splitFrom.size) {
            relativePath.append("../")
        }
        for (i in diffIndex until splitTo.size) {
            relativePath.append(splitTo[i])

            if (i < splitTo.size - 1) {
                relativePath.append("/")
            }
        }

        return relativePath.toString()
    }

    fun absolute(): String {
        return expand(value)
    }

    override fun toString(): String {
        return value
    }
}