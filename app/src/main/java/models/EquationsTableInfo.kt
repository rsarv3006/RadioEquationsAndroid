package models

import kotlin.math.log10
import kotlin.math.pow
import kotlin.math.sqrt

val EquationsTableInfo = listOf(
    EquationsTableSectionModel("Voltage", listOf(
        Equation(EquationId.voltage1, emptyList(), listOf("Current (I)", "Resistance (R)", "Voltage (E)")) { list -> list[0] * list[1] },
        Equation(EquationId.voltage2, emptyList(), listOf("Power (P)", "Current (I)", "Voltage (E)")) { list -> list[0] / list[1] },
        Equation(EquationId.voltage3, listOf(EquationFilterVariant.AdvancedFunctions), listOf("Power (P)", "Resistance (R)", "Voltage (E)")) { list -> sqrt(list[0] * list[1]) }
    )),

    EquationsTableSectionModel("Resistance", listOf(
        Equation(EquationId.resistance1, emptyList(), listOf("Voltage (E)", "Current (I)", "Resistance (R)")) { list -> list[0] / list[1] },
        Equation(EquationId.resistance2, listOf(EquationFilterVariant.AdvancedFunctions), listOf("Power (P)", "Current (I)", "Resistance (R)")) { list -> list[0] / (list[1] * list[1]) },
        Equation(EquationId.resistance3, listOf(EquationFilterVariant.AdvancedFunctions), listOf("Voltage (E)", "Power (P)", "Resistance (R)")) { list -> list[0] * list[0] / list[1] }
    )),

    EquationsTableSectionModel("Current", listOf(
        Equation(EquationId.current1, emptyList(), listOf("Voltage (E)", "Resistance (R)", "Current (I)")) { list -> list[0] / list[1] },
        Equation(EquationId.current2, emptyList(), listOf("Power (P)", "Voltage (E)", "Current (I)")) { list -> list[0] / list[1] },
        Equation(EquationId.current3, listOf(EquationFilterVariant.AdvancedFunctions), listOf("Power (P)", "Resistance (R)", "Current (I)")) { list -> sqrt(list[0] / list[1]) }
    )),

    EquationsTableSectionModel("Power", listOf(
        Equation(EquationId.power1, emptyList(), listOf("Voltage (E)", "Current (I)", "Power (P)")) { list -> list[0] * list[1] },
        Equation(EquationId.power2, listOf(EquationFilterVariant.AdvancedFunctions), listOf("Voltage (E)", "Resistance (R)", "Power (P)")) { list -> list[0] * list[0] / list[1] },
        Equation(EquationId.power3, listOf(EquationFilterVariant.AdvancedFunctions), listOf("Current (I)", "Resistance (R)", "Power (P)")) { list -> list[0] * list[0] * list[1] }
    )),

    EquationsTableSectionModel("Antenna Gain", listOf(
        Equation(EquationId.antennaGain1, emptyList(), listOf("P2", "P1", "db")) { list -> 10 * log10(list[0] / list[1]) },
        Equation(EquationId.antennaGain2, listOf(EquationFilterVariant.AdvancedFunctions), listOf("P2", "db", "P1")) { list -> list[0] / 10.0.pow(list[1] / 10)},
        Equation(EquationId.antennaGain3, listOf(EquationFilterVariant.AdvancedFunctions), listOf("P1", "db", "P2")) { list -> list[0] * 10.0.pow(list[1] / 10)}
    )),
    )