package racingcar.domain.game

import racingcar.domain.configuration.RacingCarConfiguration

class RacingCarGame(
    private val racingCarConfiguration: RacingCarConfiguration
) {
    fun run() {
        val (numberOfCars, numberOfAttempts) = racingCarConfiguration()
        // TODO("자동차 만들기")
        // TODO("numberOfAttempts만큼 움직이기")
        // TODO("움직인 정보들 기록하기")
    }
}