package racingcar.domain

import racingcar.domain.configuration.NumberOfAttempts
import racingcar.domain.configuration.NumberOfCars
import racingcar.domain.configuration.RacingCarConfiguration
import racingcar.domain.game.RacingCarGame
import racingcar.domain.view.RacingCarInput
import racingcar.input.Input

class RacingCarApplication(
    private val racingCarInput: RacingCarInput
) {

    fun run() {
        val racingCarConfiguration = RacingCarConfiguration(
            numberOfCars = NumberOfCars(racingCarInput.numberOfCars()),
            numberOfAttempts = NumberOfAttempts(racingCarInput.numberOfAttempts())
        )

        // TODO("레이싱 게임 시작하기")
        RacingCarGame(racingCarConfiguration)
        // TODO("결과 출력하기")
    }
}

fun main() {
    val input = RacingCarInput(Input())
    RacingCarApplication(input)
        .run()
}