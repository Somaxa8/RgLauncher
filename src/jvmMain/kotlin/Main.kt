
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import config.Constants
import config.CustomTheme
import views.HomeView

@Composable
@Preview
fun App() {
    MaterialTheme(colors = CustomTheme.darkColors) {
        Scaffold(backgroundColor = Color.Black) {
            HomeView().init()
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = Constants.APP_TITLE) {
        App()
    }
}
