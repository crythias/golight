package org.gwy.golight

class SignalActivity {import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.background
    import androidx.compose.foundation.clickable
    import androidx.compose.foundation.layout.*
    import androidx.compose.material.Text
    import androidx.compose.runtime.*
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.unit.sp

    class SignalActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                WelcomeScreen()
            }
        }
    }

    @Composable
    fun WelcomeScreen() {
        var currentColor by remember { mutableStateOf(Color.Green) }
        var symbol by remember { mutableStateOf("?") }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(currentColor)
                .clickable {
                    currentColor = when (currentColor) {
                        Color.Green -> Color.Yellow
                        Color.Yellow -> Color.Red
                        Color.Red -> Color.Blue
                        else -> Color.Green
                    }
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = symbol,
                fontSize = 96.sp,
                color = Color.White,
                modifier = Modifier.clickable {
                    symbol = if (symbol == "?") "!" else "?"
                }
            )
        }
    }
}