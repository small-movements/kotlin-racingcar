package racingcar.domain.view

import racingcar.input.Input

class RacingCarInput(private val input: Input) {

    fun numberOfCars(): String {
        println("자동차 대수는 몇 대 인가요?")
        return input.invoke() ?: throw IllegalArgumentException()
    }

    fun numberOfAttempts(): String {
        println("시도할 횟수는 몇 회인가요?")
        return input.invoke() ?: throw IllegalArgumentException()
    }
}