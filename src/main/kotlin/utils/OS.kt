package utils

import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toLowerCase

class OS {
    companion object {
        private val os = System.getProperty("os.name").toLowerCase(Locale.current)

        fun isLinux(): Boolean = os.contains("linux")

        fun isWindows(): Boolean = os.contains("win")
    }
}
