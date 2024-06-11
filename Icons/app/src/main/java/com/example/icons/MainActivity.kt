package com.example.icons

import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.icons.ui.theme.IconsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IconsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        MyButtomExample()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IconsTheme {
        MyIcon()
    }
}

@Composable
fun ImagenAdvance(){
    Image(
        painter = painterResource(id =R.drawable.ic_launcher_background ),
        contentDescription = "Ejemplo",
        alpha = 0.5f,
        modifier = Modifier
            .clip(CircleShape)
            .border(5.dp, Color.Red, CircleShape)
    )
}

@Composable
fun  MyImage(){
Image(
    painter = painterResource(id =R.drawable.ic_launcher_background ),
    contentDescription = "Ejemplo",
    alpha = 0.5f
)
}

@Composable
fun MyButtomExample() {
    var enabled by rememberSaveable{ mutableStateOf(true) };
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(
            onClick = { enabled= false },
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(
                containerColor= Color.Magenta,
                contentColor = Color.Blue,
                disabledContentColor = Color.Blue,
                disabledContainerColor = Color.Red
            ),
             border = BorderStroke(5.dp, Color.Green)
        )
        {
            Column {
                Text(text = "Hola")
            }

        }

        OutlinedButton(
            onClick = { enabled= false  },
            enabled = enabled,
            modifier = Modifier.padding(top = 8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor= Color.Magenta,
                contentColor = Color.Blue,
                disabledContentColor = Color.Blue,
                disabledContainerColor = Color.Red
            ),
            ) {
           Column {
               Text(text = "Hola")
           }
        }
        TextButton(onClick = {  }) {
            Column {
                Text(text = "Hola")
            }
        }
    }
}

@Composable
fun MyIcon() {
    Icon(imageVector = Icons.Rounded.Star,
        contentDescription = "Icon",
        tint = Color.Red )
}


