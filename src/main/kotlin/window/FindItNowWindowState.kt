package window

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import getWindowWidth

class FindItNowWindowState(
    override var isMinimized: Boolean,
    override var placement: WindowPlacement,
    override var position: WindowPosition,
    override var size: DpSize,
    var isVisible: Boolean
) : WindowState

fun rememberWindowState(
    isMinimized: Boolean = false,
    placement: WindowPlacement = WindowPlacement.Floating,
    position: WindowPosition = WindowPosition(Alignment.Center),
    size: DpSize = DpSize(getWindowWidth(), 150.dp),
    isVisible: Boolean = false
): FindItNowWindowState {
    return FindItNowWindowState(
        isMinimized, placement, position, size, isVisible
    )
}