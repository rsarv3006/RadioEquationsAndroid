package Models

data class Equation(
    val title: String,
    val description: String,
    val id: EquationId,
    val filters: List<EquationFilterVariant>
)

data class EquationsTableSectionModel (
    val title: String,
    val equations: List<Equation>
)