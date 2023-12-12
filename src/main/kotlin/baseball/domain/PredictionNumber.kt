package baseball.domain

class PredictionNumber(private val number: String) {
    fun validate() {
        isLengthThree()
        isNumeric()
        isInRange()
        isDuplicate()
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

    private fun isInRange() {
        for (num in number) {
            val digit = num.toString().toInt()
            if (digit !in 1..9) {
                callException()
            }
        }
    }

    private fun isDuplicate() {
        val unique = number.toSet()

        if (unique.size != number.length) {
            callException()
        }
    }

    private fun callException() {
        throw IllegalArgumentException("에러")
    }
}
