import androidx.compose.ui.window.MenuBar
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "UTools",
    ) {
        MenuBar {
            Menu("File") {
                Item("Exit", onClick = ::exitApplication)
            }
        }
        App()
    }
}