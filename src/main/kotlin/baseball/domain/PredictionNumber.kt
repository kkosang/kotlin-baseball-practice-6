package baseball.domain

class PredictionNumber(private val number: String) {
    fun validate() {
        isLengthThree()
        isNumeric()
    }

    private fun isLengthThree() {
        if (number.length != 3) {
            callException()
        }
    }

    private fun isNumeric() {
        val num = number.toIntOrNull()
        if (num == null) {
            callException()
        }
    }

    private fun callException() {
        throw IllegalArgumentException("에러")
    }
}
