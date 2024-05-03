package com.rujirakongsomran.jc_uipreview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.rujirakongsomran.jc_uipreview.ui.theme.JC_UIPreviewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JC_UIPreviewTheme {

            }
        }
    }
}

@Composable
fun SimpleComposable() {
    Text(text = "Hello World")
}

@Preview
@Composable
fun SimpleComposablePreview() {
    SimpleComposable()
}

@Preview(widthDp = 50, heightDp = 50)
@Composable
fun SquareComposablePreview() {
    Box(modifier = Modifier.background(Color.Yellow)) {
        Text(text = "Hello World")
    }
}