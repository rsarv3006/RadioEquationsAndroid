package com.example.radioequations_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.radioequations_android.ui.theme.RadioEquationsAndroidTheme
import models.Equation
import models.EquationsTableInfo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RadioEquationsAndroidTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navHost = rememberNavController()
                    val equationToRender = rememberSaveable { mutableStateOf<Equation?>(null) }

                    Scaffold {innerPadding ->
                        NavHost(
                            navController = navHost,
                            startDestination = RadioEquationsScreen.WELCOME.name,
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            composable(RadioEquationsScreen.WELCOME.name) {
                                HomeScrollView(navigateWithEquation = { equation ->
                                    equationToRender.value = equation
                                    navHost.navigate(RadioEquationsScreen.EQUATION.name) {
                                        popUpTo(RadioEquationsScreen.WELCOME.name) { inclusive = true }
                                    }
                                })
                            }

                            composable(RadioEquationsScreen.EQUATION.name) {
                                EquationTabScreen(equation = equationToRender.value!!)
                            }
                        }
                    }
                }
            }
        }
    }
}

enum class RadioEquationsScreen(@StringRes val title: Int) {
    WELCOME(title = R.string.app_name),
    EQUATION(title = R.string.equation_screen)
}

@Composable
fun HomeScrollView(navigateWithEquation: (Equation) -> Unit = {}) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {
        EquationsTableInfo.forEach { section ->
            Text(section.title, fontSize = 24.sp, modifier = Modifier.padding(16.dp))

            section.equations.forEach { equation ->
                Button(onClick = { navigateWithEquation(equation) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                    )) {
                    equation.title.Show()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScrollViewPreview() {
    RadioEquationsAndroidTheme {
        HomeScrollView()
    }
}