package calculator.domain

@JvmInline
value class Operand(private val value: Double) {

    infix fun add(input: Operand) = Operand(this.value + input.value)

    infix fun minus(input: Operand) = Operand(this.value - input.value)

    infix fun multiply(input: Operand) = Operand(this.value * input.value)

    infix fun divide(input: Operand): Operand {
        require(input.value != 0.0) { DIVIDE_ERROR_MESSAGE }
        return Operand(this.value / input.value)
    }

    override fun toString(): String {
        return "$value"
    }

    companion object {
        const val DIVIDE_ERROR_MESSAGE = "0이라는 숫자로 나눌 수 없습니다."
    }
}