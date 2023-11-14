package racingcar.domain.configuration

class RacingCarConfiguration(val numberOfCars: NumberOfCars, val numberOfAttempts: NumberOfAttempts) {
    operator fun invoke(): Pair<Int, Int> = numberOfCars.numberOfCars to numberOfAttempts.numberOfAttempts
}