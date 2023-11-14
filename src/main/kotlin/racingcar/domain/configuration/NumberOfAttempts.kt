package racingcar.domain.configuration

@JvmInline
value class NumberOfAttempts(val numberOfAttempts: Int) {
    init {
        require(numberOfAttempts >= MINMUM) {
            "NumberOfAttempts가 허용하는 범위 밖의 숫자가 입력 되었습니다."
        }
    }

    constructor(numberOfAttempts: String): this(numberOfAttempts.toInt())

    companion object {
        private const val MINMUM = 1
    }
}