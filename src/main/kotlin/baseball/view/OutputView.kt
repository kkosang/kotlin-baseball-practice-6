package baseball.view

import START_GAME_MESSAGE

class OutputView {
    fun printStartMessage() {
        println(START_GAME_MESSAGE)
    }

    fun printBallStrike(ball: Int, strike: Int) {
        if (strike == 3) {
            println("3스트라이크")
        } else if (strike == 0 && ball != 0) {
            println("${ball}볼")
        } else if (ball == 0 && strike != 0) {
            println("${strike}스트라이크")
        } else if (ball != 0 && strike != 0) {
            println("${ball}볼 ${strike}스트라이크")
        } else {
            println("낫싱")
        }
    }
}