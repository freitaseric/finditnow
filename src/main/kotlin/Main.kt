import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import dorkbox.systemTray.MenuItem
import dorkbox.systemTray.SystemTray
import java.awt.Toolkit

@Composable
@Preview
fun App() {
    MaterialTheme {
        Text("Hello World!")
    }
}

@Composable
internal fun getWindowWidth(): Dp {
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    return remember { (screenSize.width * 0.9f).dp }
}

fun main() = application {
    var isVisible by remember { mutableStateOf(true) }
    val windowState = rememberWindowState(
        placement = WindowPlacement.Floating,
        position = WindowPosition(Alignment.Center),
        size = DpSize(getWindowWidth(), 150.dp),
    )

    val tray = SystemTray.get()
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
}