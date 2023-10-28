package calculator.domain

object Calculator {

    private const val SUB_LIST_INDEX = 1
    private const val CHUNKED_SIZE = 2
    private const val OPERATOR_INDEX = 0
    private const val OPERAND_INDEX = 0
    private const val FOLD_INDEX = 0

    fun calculate(expression: Expression): Operand {
        val expressionLists = expression.split()
        return expressionLists.subList(SUB_LIST_INDEX, expressionLists.size)
            .asSequence()
            .chunked(CHUNKED_SIZE)
            .map { Operator.findBySymbol(it[OPERATOR_INDEX]) to Operand(it[OPERAND_INDEX].toDouble()) }
            .fold(Operand(expressionLists[FOLD_INDEX].toDouble())) { sum, monomial ->
                monomial.first.calculate(sum, monomial.second)
            }
    }
}