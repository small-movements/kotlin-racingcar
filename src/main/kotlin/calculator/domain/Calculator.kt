package calculator.domain

object Calculator {

    private const val INDEX_OF_OPERATOR = 0
    private const val INDEX_OF_OPERAND = 1

    fun calculate(values: List<String>): Operand {
        var result = Operand(values.first().toDouble())
        for (i in 1 until values.size step 2) {
            val operator = Operator.findBySymbol(values[INDEX_OF_OPERATOR + i])
            val operand = Operand(values[INDEX_OF_OPERAND + i].toDouble())
            result = operator.calculate(result, operand)
        }
        return result
    }
}