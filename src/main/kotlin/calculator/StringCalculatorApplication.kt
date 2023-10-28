package calculator

import calculator.domain.Calculator
import calculator.domain.Expression
import calculator.view.input
import calculator.view.printString

fun main() {
    printString()
    val expression = Expression(input())
    val result = Calculator.calculate(expression)
    println(result)
}