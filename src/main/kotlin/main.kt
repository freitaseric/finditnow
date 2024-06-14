import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import tray.FindItNowTray
import window.FindItNowWindow
import window.rememberWindowState
import java.awt.Toolkit

@Composable
internal fun rememberWindowWidth(): Dp {
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    return remember { (screenSize.width * 0.9f).dp }
}

fun main() = FindItNow {
    val windowState = rememberWindowState()

    FindItNowTray(
        icon = resources.trayIcon,
        windowState
    )

    FindItNowWindow(
        icon = resources.icon.toPainter(),
        state = windowState
    ) {
        MaterialTheme {
            Box(modifier = Modifier) {
                Text("Hello World!")
            }
        }
    }
}
