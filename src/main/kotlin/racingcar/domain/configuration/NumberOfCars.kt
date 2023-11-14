package racingcar.domain.configuration

@JvmInline
value class NumberOfCars(val numberOfCars: Int) {
    init {
        require(numberOfCars >= MINMUM) {
            "NumberOfCars 가 허용하는 범위 밖의 숫자가 입력 되었습니다."
        }
    }

    constructor(numberOfCars: String): this(numberOfCars.toInt())

    companion object {
        private const val MINMUM = 1
    }
}