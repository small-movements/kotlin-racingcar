package calculator.domain

enum class Operator(
    private val symbol: String,
    private val lambda: (Operand, Operand) -> Operand
) {
    ADD("+", Operand::add),
    MINUS("-", Operand::minus),
    MULTIPLY("*", Operand::multiply),
    DIVIDE("/", Operand::divide);

    fun calculate(left: Operand, right: Operand): Operand = lambda(left, right)

    companion object {
        fun findBySymbol(symbol: String): Operator {
            return values().find { operator -> operator.symbol == symbol }
                ?: throw IllegalArgumentException(NOT_EXIST_OPERATOR)
        }

        private const val NOT_EXIST_OPERATOR = "존재하지 않는 연산자입니다."
    }
}