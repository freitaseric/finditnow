package utils

import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toLowerCase

class System {
    companion object {
        inline val isLinux: Boolean
            get() = java.lang.System.getProperty("os.name").toLowerCase(Locale.current).contains("linux")

        inline val isWindows: Boolean
            get() = java.lang.System.getProperty("os.name").toLowerCase(Locale.current).contains("win")
    }
}