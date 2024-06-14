package window

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import rememberWindowWidth

@Composable
fun rememberWindowState() = androidx.compose.ui.window.rememberWindowState(
    isMinimized = false,
    placement = WindowPlacement.Floating,
    position = WindowPosition(Alignment.Center),
    size = DpSize(rememberWindowWidth(), 150.dp)
)

inline var WindowState.isVisible: Boolean
    get() = true
    set(value) {}