package models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Equation(
    val id: EquationId,
    val filters: List<EquationFilterVariant>,
    val labels: List<String>,
    val calculate: (DoubleArray) -> Double
) : Parcelable

data class EquationsTableSectionModel (
    val title: String,
    val equations: List<Equation>
)