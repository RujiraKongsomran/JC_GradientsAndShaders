package com.rujirakongsomran.jc_gradientsandshaders

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_gradientsandshaders.ui.theme.JC_GradientsAndShadersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_GradientsAndShadersTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun GradientBrushes() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 10.dp)
    ) {
        val brush = Brush.horizontalGradient(listOf(Color.Red, Color.Blue))
        Canvas(
            modifier = Modifier.size(100.dp),
            onDraw = {
                drawRect(brush = brush)
            }
        )

        val brush2 = Brush.linearGradient(listOf(Color.Red, Color.Blue))
        Canvas(
            modifier = Modifier.size(100.dp),
            onDraw = {
                drawRect(brush = brush2)
            }
        )
        val brush3 = Brush.verticalGradient(listOf(Color.Red, Color.Blue))
        Canvas(
            modifier = Modifier.size(100.dp),
            onDraw = {
                drawRect(brush = brush3)
            }
        )
        val brush4 = Brush.sweepGradient(listOf(Color.Red, Color.Blue))
        Canvas(
            modifier = Modifier.size(100.dp),
            onDraw = {
                drawRect(brush = brush4)
            }
        )
        val brush5 = Brush.radialGradient(listOf(Color.Red, Color.Blue))
        Canvas(
            modifier = Modifier.size(100.dp),
            onDraw = {
                drawRect(brush = brush5)
            }
        )
    }
}

@Composable
fun ChangeDistributionColorsWithColorStops() {
    val colorStop = arrayOf(
        0.0f to Color.Yellow,
        0.2f to Color.Red,
        1f to Color.Blue
    )
    Box(
        modifier = Modifier
            .requiredSize(200.dp)
            .background(Brush.horizontalGradient(colorStops = colorStop))
    )

}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    JC_GradientsAndShadersTheme {
        ChangeDistributionColorsWithColorStops()
    }
}