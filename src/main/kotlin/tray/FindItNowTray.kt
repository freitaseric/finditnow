package tray

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.WindowState
import java.awt.SystemTray
import java.awt.Toolkit
import java.awt.TrayIcon
import java.net.URL

@Composable
fun FindItNowTray(
    icon: URL, windowState: WindowState
) {
    if (!SystemTray.isSupported()) {
        println("Teu sistema não suporta Tray irmãozinho")
    }
    val tray = SystemTray.getSystemTray()

    val image = Toolkit.getDefaultToolkit().createImage(icon)
    val trayIcon = TrayIcon(image, "FindItNow")
    trayIcon.isImageAutoSize = true

    tray.add(trayIcon)
}