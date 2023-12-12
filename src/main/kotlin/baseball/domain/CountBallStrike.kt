package baseball.domain

class CountBallStrike(private val user: String, private val computer: String) {
    private var ball = 0
    private var strike = 0
    private var finish = false

    fun count(): Triple<Int, Int, Boolean> {
        val result = compareNumbers()

        return result
    }

    private fun compareNumbers(): Triple<Int, Int, Boolean> {
        for ((index, userDigit) in user.withIndex()) {
            val computerDigit = computer[index]

            if (userDigit == computerDigit) {
                strike++
            } else if (computer.contains(userDigit)) {
                ball++
            }
        }

        if (strike == 3)
            finish = true

        return Triple(ball, strike, finish)
    }
}