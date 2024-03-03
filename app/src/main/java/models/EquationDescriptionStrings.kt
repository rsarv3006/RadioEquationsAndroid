package models

import com.vkochenkov.equationdisplayerlib.EquationItem

val VoltageCurrentResistanceDescriptionString = listOf(
    "The equation",
    VoltageCurrentResistanceTitle,
    """represents the relationship between electrical energy (E), current (I), and resistance (R) in an electrical circuit.

Here's a breakdown of each component:

E represents electrical energy and is measured in joules (J) or sometimes in electron volts (eV). It refers to the amount of energy transferred or used by an electrical circuit or device.
I stands for current and is measured in amperes (A). Current refers to the flow of electric charge in a circuit, specifically the rate at which charges move through a conductor.
R represents resistance and is measured in ohms (Ω). Resistance is a property of a circuit element, such as a resistor or a wire, that opposes the flow of electric current.
According to Ohm's Law, the equation """,
    VoltageCurrentResistanceTitle,
    """expresses the relationship between these three variables. It states that the electrical energy (E) dissipated or consumed in a circuit is equal to the product of the current (I) flowing through the circuit and the resistance (R) encountered by the current.

In practical terms, this equation can be used to calculate the energy consumption or dissipation in a circuit when the current and resistance values are known. 
Alternatively, it can be rearranged to solve for other variables. For example, if you know the energy and resistance, you can calculate the current by rearranging the equation as
""",
    EquationItem(line = "I = E / R")
)

val PowerVoltageCurrentDescriptionString = listOf(
    "The equation",
    PowerVoltageCurrentTitle,
    """"
represents the relationship between power (P), electrical energy (E), and current (I) in an electrical circuit.

Here's a breakdown of each component:

P represents power and is measured in watts (W). Power refers to the rate at which energy is transferred, used, or consumed in a circuit or device.
E represents electrical energy and is measured in joules (J) or sometimes in electron volts (eV). It refers to the amount of energy transferred or used by an electrical circuit or device.
I stands for current and is measured in amperes (A). Current refers to the flow of electric charge in a circuit, specifically the rate at which charges move through a conductor.
The equation expresses the relationship between these variables. It states that the power (P) in a circuit is equal to the product of the electrical energy (E) and the current (I) flowing through the circuit.

This equation is derived from the definition of power, which is the rate at which energy is transferred. By multiplying the energy transferred (E) by the rate at which it is transferred (I), we obtain the power.

In practical terms, this equation is commonly used to calculate the power consumption or dissipation in a circuit when the energy and current values are known. It can also be rearranged to solve for other variables. For example, if you know the power and current, you can calculate the energy by rearranging the equation as
""",
    EquationItem(line = "E = P / I")
)

val PowerCurrentResistanceDescriptionString = listOf(
    "The equation",
    ResistancePowerCurrentTitle,
    """
represents the relationship between power (P), current (I), and resistance (R) in an electrical circuit.

Here's a breakdown of each component:

P represents power and is measured in watts (W). Power refers to the rate at which energy is transferred, used, or consumed in a circuit or device.
I stands for current and is measured in amperes (A). Current refers to the flow of electric charge in a circuit, specifically the rate at which charges move through a conductor.
R represents resistance and is measured in ohms (Ω). Resistance is a property of a circuit element, such as a resistor or a wire, that opposes the flow of electric current.

The equation expresses the relationship between these variables. It states that the power (P) in a circuit is equal to the square of the current (I) multiplied by the resistance (R) encountered by the current.

This equation is derived from Ohm's Law, which states that the current flowing through a conductor is directly proportional to the voltage across it and inversely proportional to the resistance. By substituting the expression for current from Ohm's Law
 """,
    EquationItem(line = "I = V / R"),
        "into the equation",
    PowerCurrentResistanceTitle,
    """we can derive the power formula.

In practical terms, this equation is commonly used to calculate the power dissipation in a circuit when the current and resistance values are known. It illustrates that power is directly proportional to the square of the current and the resistance. Therefore, a circuit with higher current or higher resistance will dissipate more power. Conversely, decreasing either the current or resistance will result in lower power dissipation.
"""
)

val PowerVoltageResistanceDescriptionString = listOf(
    "The equation",
    PowerVoltageResistanceTitle,
    """
represents the relationship between power (P), electrical energy (E), and resistance (R) in an electrical circuit.

Here's a breakdown of each component:

P represents power and is measured in watts (W). Power refers to the rate at which energy is transferred, used, or consumed in a circuit or device.
E represents electrical energy and is measured in joules (J) or sometimes in electron volts (eV). It refers to the amount of energy transferred or used by an electrical circuit or device.
R represents resistance and is measured in ohms (Ω). Resistance is a property of a circuit element, such as a resistor or a wire, that opposes the flow of electric current.
The equation expresses the relationship between these variables. It states that the power (P) in a circuit is equal to the square of the electrical energy (E) divided by the resistance (R) encountered by the current.

This equation can be derived by combining Ohm's Law
 """,
    EquationItem(line = "I = V / R"),
   "with the power formula",
    EquationItem(line = "P = V / I"),
    "Since voltage (V) can be expressed as ",
    EquationItem(line = "V = E / Q"),
    "(where Q is the charge), and current (I) can be expressed as",
    EquationItem(line = "I = Q / t"),
    "(where t is time), we can substitute these expressions into the power formula and rearrange to obtain",
    PowerVoltageResistanceTitle,
    """
In practical terms, this equation is commonly used to calculate the power dissipation in a circuit when the electrical energy and resistance values are known. It shows that power is inversely proportional to the resistance and that doubling the resistance will halve the power dissipation. Similarly, increasing the electrical energy will result in higher power, assuming the resistance remains constant.
"""
)

val AntennaGainDescriptionString = listOf("""
The antenna gain equation calculates the gain of an antenna in decibels (dB). The gain represents how much an antenna concentrates radio frequency energy in a particular direction, if the antenna is a non-omnidirectional antenna.  If it is an omni-directional antenna, then the gain or main-lobe of the radio frequency energy is assumed to radiate in a 360-degree pattern, as in a sphere-shaped pattern.

The formula is:
""",
    AntennaGainDbTitle,
    """
Where:

Output power is the power radiated by the antenna in the direction of peak radiation intensity. This is measured in watts (W).
Input power is the power supplied to the antenna at its input terminals. This is also measured in watts.
log10 is the base-10 logarithm function.
10 is a constant factor to convert the logarithmic value to decibels.
The ratio of output power to input power gives the power gain of the antenna. Taking the logarithm of this ratio gives the gain in absolute units. Multiplying by 10 converts this to decibels, which is the standard unit used to express antenna gain.

So in summary, this formula takes the ratio of output to input power, takes the logarithm to get the absolute gain, and then converts to decibels to calculate the total antenna gain. The higher the gain in dB, the more intense the antenna radiation is in a particular direction (if a non-omnidirectional antenna) or not (if an omnidirectional antenna.)
"""
)