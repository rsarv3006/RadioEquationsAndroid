package models

val EquationsTableInfo = listOf(
    EquationsTableSectionModel("Voltage", listOf(
        Equation(VoltageCurrentResistanceTitle, VoltageCurrentResistanceDescriptionString, EquationId.voltage1, emptyList()),
        Equation(VoltagePowerCurrentTitle, PowerVoltageCurrentDescriptionString, EquationId.voltage2, emptyList()),
        Equation(VoltagePowerResistanceTitle, PowerVoltageResistanceDescriptionString, EquationId.voltage3, listOf(EquationFilterVariant.AdvancedFunctions))
    )),

    EquationsTableSectionModel("Resistance", listOf(
        Equation(ResistanceVoltageCurrentTitle, VoltageCurrentResistanceDescriptionString, EquationId.resistance1, emptyList()),
        Equation(ResistancePowerCurrentTitle, PowerCurrentResistanceDescriptionString, EquationId.resistance2, listOf(EquationFilterVariant.AdvancedFunctions)),
        Equation(ResistanceVoltagePowerTitle, PowerVoltageResistanceDescriptionString, EquationId.resistance3, listOf(EquationFilterVariant.AdvancedFunctions))
    )),

    EquationsTableSectionModel("Current", listOf(
        Equation(CurrentVoltageResistanceTitle, VoltageCurrentResistanceDescriptionString, EquationId.current1, emptyList()),
        Equation(CurrentPowerVoltageTitle, PowerVoltageCurrentDescriptionString, EquationId.current2, emptyList()),
        Equation(CurrentPowerResistanceTitle, PowerCurrentResistanceDescriptionString, EquationId.current3, listOf(EquationFilterVariant.AdvancedFunctions))
    )),

    EquationsTableSectionModel("Power", listOf(
        Equation(PowerVoltageCurrentTitle, PowerVoltageCurrentDescriptionString, EquationId.power1, emptyList()),
        Equation(PowerVoltageResistanceTitle, PowerVoltageResistanceDescriptionString, EquationId.power2, listOf(EquationFilterVariant.AdvancedFunctions)),
        Equation(PowerCurrentResistanceTitle, PowerCurrentResistanceDescriptionString, EquationId.power3, listOf(EquationFilterVariant.AdvancedFunctions))
    )),

    EquationsTableSectionModel("Antenna Gain", listOf(
        Equation(AntennaGainDbTitle, AntennaGainDescriptionString, EquationId.antennaGain1, emptyList()),
        Equation(AntennaGainP1Title, AntennaGainDescriptionString, EquationId.antennaGain2, listOf(EquationFilterVariant.AdvancedFunctions)),
        Equation(AntennaGainP2Title, AntennaGainDescriptionString, EquationId.antennaGain3, listOf(EquationFilterVariant.AdvancedFunctions))
    )),

    )