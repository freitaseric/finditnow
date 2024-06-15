import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import tray.FindItNowTray
import utils.isLinux
import window.FindItNowWindow
import window.error.ErrorWindow
import window.rememberWindowState
import java.awt.Toolkit

@Composable
internal fun rememberWindowWidth(): Dp {
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    return remember { (screenSize.width * 0.9f).dp }
}

fun main() = FindItNow {
    if (isLinux()) {
        val windowState = rememberWindowState()

        FindItNowTray(
            icon = resources.trayIcon, windowState
        )

        FindItNowWindow(
            icon = resources.icon.toPainter(), state = windowState
        ) {
            MaterialTheme {
                Box(modifier = Modifier) {
                    Text("Hello World!")
                }
            }
        }
    } else {
        ErrorWindow(
            onCloseRequest = ::exitApplication,
            icon = resources.icon.toPainter(),
            errorCode = 3,
            errorMessage = "Your operational system is not supported by this application! We just have support for Linux-based systems."
        )
    }
}
