package calculator.domain

@JvmInline
value class Expression(private val expression: String) {
    init {
        require(expression.isNotBlank()) { NULL_OR_BLANK_MESSAGE }
    }

    fun split() = expression.split(BLANK)

    companion object {
        private const val NULL_OR_BLANK_MESSAGE = "연산식이 null 또는 공백입니다."
        private const val BLANK = " "
    }
}