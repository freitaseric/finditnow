package window.error

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import window.rememberWindowState

@Composable
fun ErrorWindow(
    errorCode: Int, errorMessage: String, onCloseRequest: () -> Unit, icon: Painter
) = Window(
    onCloseRequest, rememberWindowState(), true, "FindItNow | Error Handling", icon,
) {
    MaterialTheme(
        colors = darkColors(
            primary = Color(220, 20, 60),
            secondary = Color(255, 99, 71),
            background = Color(112, 128, 144),
            error = Color(255, 0, 0),
            surface = Color(216, 191, 216),
            primaryVariant = Color(220, 20, 60),
            secondaryVariant = Color(255, 99, 71),
            onBackground = Color(176, 196, 222),
            onPrimary = Color(176, 196, 222),
            onSecondary = Color(176, 196, 222),
            onError = Color(176, 196, 222),
            onSurface = Color(0, 0, 0)
        ),
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text("An error has ocurred while trying to launch the Application!")
                Text("Error Code: $errorCode")
                Text(errorMessage)
            }
        }
    }
}