package models

enum class EquationId {
    ohmsLaw,
    powerEquation,
    test,
    voltage1,
    voltage2,
    voltage3,
    resistance1,
    resistance2,
    resistance3,
    current1,
    current2,
    current3,
    power1,
    power2,
    power3,
    antennaGain1,
    antennaGain2,
    antennaGain3,
    impedance1,
    impedance2,
    impedance3;

    companion object {
        val values = enumValues<EquationId>()
        fun from(value: String) = values.firstOrNull { it.name == value }
        fun toString(value: EquationId) = value.name
    }
}