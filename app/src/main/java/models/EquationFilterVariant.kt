package models

enum class EquationFilterVariant {
    AdvancedFunctions;

    companion object {
        val values = enumValues<EquationFilterVariant>()
        fun from(value: String) = values.firstOrNull { it.name == value }
        fun toString(value: EquationFilterVariant) = value.name
    }
}