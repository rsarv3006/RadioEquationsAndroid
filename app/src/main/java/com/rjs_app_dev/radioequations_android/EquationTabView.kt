package com.rjs_app_dev.radioequations_android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Functions
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rjs_app_dev.radioequations_android.ui.theme.RadioEquationsAndroidTheme
import models.Equation
import models.EquationsTableInfo

@Composable
fun EquationTabScreen(equation: Equation) {
    var tabIndex by remember { mutableIntStateOf(0) }

    val tabs = listOf("Equation", "Description" )

    Column(modifier = Modifier.fillMaxWidth()) {
        TabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(text = { Text(title) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index },
                    icon = {
                        when (index) {
                            0 -> Icon(imageVector = Icons.Default.Functions, contentDescription = null)
                            1 -> Icon(imageVector = Icons.Default.Description, contentDescription = null)
                        }
                    }
                )
            }
        }
        when (tabIndex) {
            0 -> EquationCalculationScreen(equation = equation)
            1 -> EquationDescriptionScreen(equation = equation)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EquationTabViewPreview() {
    RadioEquationsAndroidTheme {
        EquationTabScreen(equation = EquationsTableInfo.first().equations.first())
    }
}

