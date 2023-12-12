package baseball.domain

class PredictionNumber(private val number: String) {
    fun validate() {
        isLengthThree()
    }

    private fun isLengthThree() {
        if (number.length != 3) {
            callException()
        }
    }

    private fun callException() {
        throw IllegalArgumentException("에러")
    }
}
