package calculator

import calculator.domain.Operand
import calculator.domain.Operand.Companion.DIVIDE_ERROR_MESSAGE
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class OperandTest : BehaviorSpec({

    Given("덧셈 결과 테스트") {
        val operand1 = Operand(1.0)
        val operand2 = Operand(2.0)
        When("피연산자가 1, 2가 주어졌을 때") {
            Then("1 + 2는 3이어야 한다") {
                operand1 add operand2 shouldBe Operand(3.0)
            }
        }
    }

    Given("뺄셈 결과 테스트") {
        val operand1 = Operand(2.0)
        val operand2 = Operand(1.0)
        When("피연산자가 2, 1가 주어졌을 때") {
            Then("2 - 1는 1이어야 한다") {
                operand1 minus operand2 shouldBe Operand(1.0)
            }
        }
    }

    Given("곱셈 결과 테스트") {
        val operand1 = Operand(2.0)
        val operand2 = Operand(1.0)
        When("피연산자가 2, 1가 주어졌을 때") {
            Then("2 * 1는 1이어야 한다") {
                operand1 multiply operand2 shouldBe Operand(2.0)
            }
        }
    }

    Given("나눗셈 결과 테스트") {
        val operand1 = Operand(4.0)
        val operand2 = Operand(2.0)
        When("피연산자가 4, 2가 주어졌을 때") {
            Then("4 / 2는 1이어야 한다") {
                operand1 divide operand2 shouldBe Operand(2.0)
            }
        }
    }

    Given("나눗셈 0으로 나누는 경우") {
        val operand1 = Operand(4.0)
        val operand2 = Operand(0.0)
        When("피연산자가 4, 0가 주어졌을 때") {
            Then("4 * 0은 에러가 발생해야한다.") {
                val exception = shouldThrow<IllegalArgumentException> {
                    operand1 divide operand2
                }
                exception.message shouldBe DIVIDE_ERROR_MESSAGE
            }
        }
    }
})