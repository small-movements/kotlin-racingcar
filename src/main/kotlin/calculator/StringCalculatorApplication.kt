package calculator

import calculator.domain.Calculator
import calculator.view.getSplitString
import calculator.view.printString

fun main() {
    printString()
    val symbols = getSplitString()
    val result = Calculator.calculate(symbols)
    println(result)
}