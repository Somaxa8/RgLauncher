package views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

class HomeView {

    @Composable
    @Preview
    fun init() {
        var text by remember { mutableStateOf("Hello, World!") }

        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }
    }
}