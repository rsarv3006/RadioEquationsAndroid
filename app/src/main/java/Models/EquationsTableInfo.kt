package Models

val EquationsTableInfo = listOf(

    EquationsTableSectionModel("Voltage", listOf(
        Equation("E = I \\times R", VoltageCurrentResistanceDescriptionString, EquationId.voltage1, emptyList()),
        Equation("E = P / I", PowerVoltageCurrentDescriptionString, EquationId.voltage2, emptyList()),
        Equation("E = \\sqrt{P \\times R}", PowerVoltageResistanceDescriptionString, EquationId.voltage3, listOf(EquationFilterVariant.AdvancedFunctions))
    )),

    EquationsTableSectionModel("Resistance", listOf(
        Equation("R = E / I", VoltageCurrentResistanceDescriptionString, EquationId.resistance1, emptyList()),
        Equation("R = P / I^2", PowerCurrentResistanceDescriptionString, EquationId.resistance2, listOf(EquationFilterVariant.AdvancedFunctions)),
        Equation("R = E^2 / P", PowerVoltageResistanceDescriptionString, EquationId.resistance3, listOf(EquationFilterVariant.AdvancedFunctions))
    )),

    EquationsTableSectionModel("Current", listOf(
        Equation("I = E / R", VoltageCurrentResistanceDescriptionString, EquationId.current1, emptyList()),
        Equation("I = P / E", PowerVoltageCurrentDescriptionString, EquationId.current2, emptyList()),
        Equation("I = \\sqrt{P / R}", PowerCurrentResistanceDescriptionString, EquationId.current3, listOf(EquationFilterVariant.AdvancedFunctions))
    )),

    EquationsTableSectionModel("Power", listOf(
        Equation("P = E \\times I", PowerVoltageCurrentDescriptionString, EquationId.power1, emptyList()),
        Equation("P = E^2 / R", PowerVoltageResistanceDescriptionString, EquationId.power2, listOf(EquationFilterVariant.AdvancedFunctions)),
        Equation("P = I^2 \\times R", PowerCurrentResistanceDescriptionString, EquationId.power3, listOf(EquationFilterVariant.AdvancedFunctions))
    )),

    EquationsTableSectionModel("Antenna Gain", listOf(
        Equation("db = 10 \\times log_1_0(P2 / P1)", AntennaGainDescriptionString, EquationId.antennaGain1, emptyList()),
        Equation("P1 = P2 / 10^(^d^b^/^1^0^)", AntennaGainDescriptionString, EquationId.antennaGain2, listOf(EquationFilterVariant.AdvancedFunctions)),
        Equation("P2 = P1 \\times 10^(^1^0 ^\\times ^d^b^)", AntennaGainDescriptionString, EquationId.antennaGain3, listOf(EquationFilterVariant.AdvancedFunctions))
    )),

    )