package calculator.domain

@JvmInline
value class Operand(private val value: Double) {

    fun add(input: Operand) = Operand(this.value + input.value)

    fun minus(input: Operand) = Operand(this.value - input.value)

    fun multiply(input: Operand) = Operand(this.value * input.value)

    fun divide(input: Operand): Operand {
        require(input.value != 0.0) { "0이라는 숫자로 나눌 수 없습니다. " }
        return Operand(this.value / input.value)
    }

    override fun toString(): String {
        return "$value"
    }
}