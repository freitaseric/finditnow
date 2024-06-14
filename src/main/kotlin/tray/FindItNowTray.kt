package tray

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.WindowState
import dorkbox.systemTray.SystemTray
import java.net.URL

@Composable
fun FindItNowTray(
    icon: URL, windowState: WindowState
): SystemTray {
    val tray = SystemTray.get()

    tray.setImage(icon)

    tray.setEnabled(true)

    return tray
}