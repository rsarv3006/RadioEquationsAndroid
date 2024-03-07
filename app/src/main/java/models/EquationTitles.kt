package models

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.rjs_app_dev.radioequations_android.ui.theme.RadioEquationsAndroidTheme
import com.vkochenkov.equationdisplayerlib.EquationItem

val VoltageCurrentResistanceTitle = EquationItem(line = "E = I x R")
val VoltagePowerCurrentTitle = EquationItem(line = "E = P / I")
val VoltagePowerResistanceTitle = EquationItem(line = listOf(
    EquationItem(line = "E = "),
    EquationItem(line = "P x R", sqrt = 2)
))

val ResistanceVoltageCurrentTitle = EquationItem(line = "R = E / I")
val ResistancePowerCurrentTitle = EquationItem(line = listOf(
    EquationItem(line = "R = P / "),
    EquationItem(line = "I", superscript = "2")
))
val ResistanceVoltagePowerTitle = EquationItem(line = listOf(
    EquationItem(line = "R = "),
    EquationItem(line = "E", superscript = "2"),
    EquationItem(line = " / P")
))

val CurrentVoltageResistanceTitle = EquationItem(line = "I = E / R")
val CurrentPowerVoltageTitle = EquationItem(line = "I = P / E")
val CurrentPowerResistanceTitle = EquationItem(line = listOf(
    EquationItem(line = "I = "),
    EquationItem(line = "P / R", sqrt = 2)
))

val PowerVoltageCurrentTitle = EquationItem(line = "P = E x I")
val PowerVoltageResistanceTitle = EquationItem(line = listOf(
    EquationItem(line = "P = "),
    EquationItem(line = "E", superscript = "2"),
    EquationItem(line = " / R")
))
val PowerCurrentResistanceTitle = EquationItem(line = listOf(
    EquationItem(line = "P = "),
    EquationItem(line = "I", superscript = "2"),
    EquationItem(line = " x R")
))

val AntennaGainDbTitle = EquationItem(line = listOf(
    EquationItem(line = "db = 10 x "),
    EquationItem(line = "log", subscript = "10"),
    EquationItem(line = "(P2 / P1)")
))
val AntennaGainP1Title = EquationItem(line = listOf(
    EquationItem(line = "P1 = P2 / "),
    EquationItem(line = "10", superscript = "db / 10")
))
val AntennaGainP2Title = EquationItem(line = listOf(
    EquationItem(line = "P2 = P1 / "),
    EquationItem(line = "10", superscript = "db x 10")
))

@Preview(showBackground = true)
@Composable
fun EquationTitlePreviews() {
    RadioEquationsAndroidTheme {
        Column {
            VoltageCurrentResistanceTitle.Show()

            VoltagePowerCurrentTitle.Show()

            VoltagePowerResistanceTitle.Show()

            ResistanceVoltageCurrentTitle.Show()

            ResistancePowerCurrentTitle.Show()

            ResistanceVoltagePowerTitle.Show()

            CurrentVoltageResistanceTitle.Show()

            CurrentPowerVoltageTitle.Show()

            CurrentPowerResistanceTitle.Show()

            PowerVoltageCurrentTitle.Show()

            PowerVoltageResistanceTitle.Show()

            PowerCurrentResistanceTitle.Show()

            AntennaGainDbTitle.Show()

            AntennaGainP1Title.Show()

            AntennaGainP2Title.Show()
        }
    }
}