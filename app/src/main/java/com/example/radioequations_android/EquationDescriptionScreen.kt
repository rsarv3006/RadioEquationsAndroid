package com.example.radioequations_android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.vkochenkov.equationdisplayerlib.EquationItem
import models.Equation

@Composable
fun EquationDescriptionScreen(equation: Equation) {
    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())
        .fillMaxSize()) {
        equation.description.forEach {item ->
            when (item) {
                is String -> Text(text = item)
                is EquationItem -> item.Show()
            }
        }
    }
}