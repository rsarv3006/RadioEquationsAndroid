package com.example.radioequations_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.radioequations_android.ui.theme.RadioEquationsAndroidTheme
import models.Equation
import models.RadioEquationsScreen

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

                    val backStackEntry by navHost.currentBackStackEntryAsState()

                    val currentScreen = RadioEquationsScreen.valueOf(
                        backStackEntry?.destination?.route ?: RadioEquationsScreen.WELCOME.name
                    )

                    Scaffold(
                        topBar = {
                                RadioEquationsAppBar(
                                    currentScreen = currentScreen,
                                    canNavigateBack = backStackEntry?.destination?.route != RadioEquationsScreen.WELCOME.name,
                                    navigateUp = {
                                        navHost.popBackStack()
                                    },
                                )
                        }
                    ) { innerPadding ->
                        NavHost(
                            navController = navHost,
                            startDestination = RadioEquationsScreen.WELCOME.name,
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            composable(RadioEquationsScreen.WELCOME.name) {
                                HomeScrollView(navigateWithEquation = { equation ->
                                    equationToRender.value = equation
                                    navHost.navigate(RadioEquationsScreen.EQUATION.name)
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

