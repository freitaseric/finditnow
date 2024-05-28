import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.application
import window.Window
import java.awt.Toolkit

@Composable
internal fun getWindowWidth(): Dp {
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    return remember { (screenSize.width * 0.9f).dp }
}

fun main() = application {
/*    val tray = SystemTray.get()
    val resource = this::class.java.classLoader.getResource("icon.png")

    tray.setImage(resource)
    tray.menu.add(MenuItem("Open") { isVisible = true })
    tray.menu.add(MenuItem("Exit") { isVisible = false })

    Window(
        onCloseRequest = { isVisible = false },
        title = "FindItNow",
        state = windowState,
        undecorated = true,
        resizable = false,
        alwaysOnTop = true,
        icon = painterResource("icon.png")
    ) {
        App()
        window.isVisible = isVisible
    }
 */

    Window()
}
