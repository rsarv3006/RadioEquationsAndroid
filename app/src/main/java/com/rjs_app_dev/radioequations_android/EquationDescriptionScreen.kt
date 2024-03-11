package com.rjs_app_dev.radioequations_android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.vkochenkov.equationdisplayerlib.EquationItem
import models.Equation
import models.getEquationDescriptionString
import models.getTitleForEquationId

@Composable
fun EquationDescriptionScreen(equation: Equation) {
    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())
        .padding(16.dp)
        .fillMaxSize()) {
        getEquationDescriptionString(equation.id).forEach {item ->
            when (item) {
                is String -> Text(text = item)
                is EquationItem -> Button(onClick = { },
                    enabled = false,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        disabledContainerColor = Color.White
                    )) {
                    getTitleForEquationId(equation.id).Show()
                }
            }
        }
    }
}