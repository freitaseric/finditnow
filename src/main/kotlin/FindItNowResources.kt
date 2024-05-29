import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import java.net.URL

class FindItNowResources {
    inline val icon: URL
        get() = this::class.java.classLoader.getResource("icon.png") ?: throw Error(
            "The app icon was not found in app resources!"
        )

    inline val trayIcon: URL
        get() = this::class.java.classLoader.getResource("tray-icon.png") ?: throw Error(
            "The tray icon was not found in app resources!"
        )
}

@Composable
fun rememberAppResources() = remember { FindItNowResources() }

@Composable
fun URL.toPainter(): Painter = painterResource(file.split("/").last())