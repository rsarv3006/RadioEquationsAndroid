package com.example.radioequations_android

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.radioequations_android.ui.theme.RadioEquationsAndroidTheme
import models.Equation
import models.EquationsTableInfo

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