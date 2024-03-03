package com.example.radioequations_android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import models.Equation

@Composable
fun EquationDescriptionScreen(equation: Equation) {
    Column(modifier = Modifier.fillMaxWidth()) {
        equation.title.Show()


    }
}