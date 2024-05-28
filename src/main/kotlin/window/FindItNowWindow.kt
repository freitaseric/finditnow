package window

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState

class FindItNowWindow(
    private val state: WindowState = rememberWindowState()
) {
    init {
        Window(
            onCloseRequest = {},
            title = "FindItNow",
            state = state,
            undecorated = true,
            resizable = false,
            alwaysOnTop = true,
            icon = painterResource("icon.png")
        ) {
            Box {
                Text("Hello World!")
            }
        }
    }
}

@Composable
fun Window() = FindItNowWindow()