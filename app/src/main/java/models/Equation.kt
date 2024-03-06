package models

import com.vkochenkov.equationdisplayerlib.EquationItem

data class Equation(
    val title: EquationItem,
    val description: List<Any>,
    val id: EquationId,
    val filters: List<EquationFilterVariant>,
    val labels: List<String>,
    val calculate: (DoubleArray) -> Double
)

data class EquationsTableSectionModel (
    val title: String,
    val equations: List<Equation>
)