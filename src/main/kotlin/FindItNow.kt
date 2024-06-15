import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.configureSwingGlobalsForCompose
import androidx.compose.ui.window.ApplicationScope
import androidx.compose.ui.window.awaitApplication
import kotlinx.coroutines.runBlocking
import types.Environment

@OptIn(ExperimentalComposeUiApi::class)
@Suppress("FunctionName")
fun FindItNow(
    content: @Composable ApplicationScope.() -> Unit
) {
    if (System.getProperty("compose.application.configure.swing.globals") == "true") {
        configureSwingGlobalsForCompose()
    }

    runBlocking {
        awaitApplication {
            content()
        }
    }
}

inline val ApplicationScope.config: FindItNowConfiguration
    @Composable get() = rememberAppConfiguration()

inline val ApplicationScope.globalState: FindItNowState
    @Composable get() = rememberAppState()

inline val ApplicationScope.resources: FindItNowResources
    @Composable get() = rememberAppResources()

inline val ApplicationScope.env: Environment
    @Composable get() = Environment
