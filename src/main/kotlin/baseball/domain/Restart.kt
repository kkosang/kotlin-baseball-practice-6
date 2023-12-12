package baseball.domain

class Restart(private var restart: String) {
    fun validateRestart(): Int {
        isNumeric()
        isInRange()
        return restart.toInt()
    }

    private fun isNumeric() {
        val num = restart.toIntOrNull()
        if (num == null) {
            callException()
        }
    }

    private fun isInRange() {
        val num = restart.toInt()
        if (num !in 1..2) {
            callException()
        }
    }

    private fun callException() {
        throw IllegalArgumentException("에러")
    }
}