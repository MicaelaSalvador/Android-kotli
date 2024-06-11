package com.example.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MySuperText("")
                }
            }
        }
    }
}

@Preview(
    name = "preview 1 way",
    heightDp = 50,
    widthDp = 200,
    showBackground = true,
    showSystemUi = true,
    device = Devices.NEXUS_5,
)


@Composable
fun MyTestSuperText() {
    MySuperText("PEPE")
}

@Composable
fun MySuperText(name: String) {
    Text(
        text = "SOY MICAELA  SALVADOR  y tu:( $name",
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 20.dp)
    )
}

