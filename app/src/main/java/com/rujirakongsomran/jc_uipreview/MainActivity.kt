package com.rujirakongsomran.jc_uipreview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
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

@Composable
fun DynamicColor() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Hello M3!")
    }
}

@Preview(
    showBackground = true,
    wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE
)
@Composable
fun DynamicColorPreview() {
    JC_UIPreviewTheme {
        DynamicColor()
    }
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

@Preview(showBackground = true, backgroundColor = 0xFF00FF00)
@Composable
fun WithGreenBackground() {
    Text(text = "Hello World")
}

@Preview(showSystemUi = true)
@Composable
fun DecoratedComposablePreview() {
    Text(text = "Hello World")
}

@Preview(
    name = "small font",
    group = "font scales",
    fontScale = 0.5f
)
@Preview(
    name = "large font",
    group = "font scales",
    fontScale = 1.5f
)
annotation class FontScalePreviews

@FontScalePreviews
@Composable
fun HelloWorldPreview() {
    Text(text = "Hello World")
}

@Preview(
    name = "Spanish",
    group = "locale",
    locale = "es"
)
@FontScalePreviews
annotation class CombinedPreviews

@CombinedPreviews
@Composable
fun HelloWorldPreview2() {
    JC_UIPreviewTheme {
        Surface {
            Text(text = stringResource(androidx.compose.ui.R.string.in_progress))
        }
    }
}