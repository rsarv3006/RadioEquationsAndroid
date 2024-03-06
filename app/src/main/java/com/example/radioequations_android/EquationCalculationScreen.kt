package com.example.radioequations_android

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.radioequations_android.ui.theme.RadioEquationsAndroidTheme
import models.Equation
import models.EquationsTableInfo

@Composable
fun EquationCalculationScreen(equation: Equation) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val valuesState = remember {
            mutableStateOf(DoubleArray(equation.labels.size))
        }

        Spacer(modifier = Modifier.height(16.dp))
        equation.title.Show()

        Column(modifier = Modifier.padding(16.dp)) {
            for (i in 0 until equation.labels.size) {
                        OutlinedTextField(
                            value = valuesState.value[i].toString(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                            onValueChange = { value ->
                                valuesState.value = valuesState.value.toMutableList().also { list ->
                                    list[i] = value.toDoubleOrNull() ?: 0.0
                                }.toDoubleArray()
                            },
                            modifier = Modifier.padding(top = 16.dp),
                            readOnly = i == equation.labels.lastIndex,
                            label = { Text(text = "Enter ${equation.labels[i]}") },
                        )
            }
        }


        ElevatedButton(onClick = {
                                 val valuesWithoutLast = valuesState.value.copyOfRange(0, valuesState.value.size - 1)
                                    val result = equation.calculate(valuesWithoutLast)
                                    valuesState.value = valuesState.value.toMutableList().also { list ->
                                        list[list.lastIndex] = result
                                    }.toDoubleArray()
        }, modifier = Modifier.padding(16.dp)) {
            Text(text = "Calculate")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EquationCalculationScreenPreview() {
    RadioEquationsAndroidTheme {
        EquationCalculationScreen(equation = EquationsTableInfo.first().equations.first())
    }
}

