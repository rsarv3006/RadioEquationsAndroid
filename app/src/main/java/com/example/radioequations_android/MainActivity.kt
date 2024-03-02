package com.example.radioequations_android

import Models.EquationsTableInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.radioequations_android.ui.theme.RadioEquationsAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RadioEquationsAndroidTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScrollItems()
                }
            }
        }
    }
}

@Composable
fun ScrollItems() {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState()).fillMaxSize()
    ) {
        EquationsTableInfo.forEach { section ->
            Text(section.title, fontSize = 24.sp, modifier = Modifier.padding(16.dp))

            section.equations.forEach { equation ->

                Text(equation.title)

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RadioEquationsAndroidTheme {
        Greeting("Android")
    }
}