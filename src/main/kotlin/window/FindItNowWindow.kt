package window

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState

@Composable
fun FindItNowWindow(
    icon: Painter, state: WindowState = rememberWindowState(), content: @Composable FrameWindowScope.() -> Unit
) = Window(
    onCloseRequest = { state.isVisible = !state.isVisible },
    state = state,
    content = content,
    undecorated = true,
    alwaysOnTop = true,
    icon = icon,
    title = "FindItNow",
    resizable = false,
    visible = state.isVisible
)