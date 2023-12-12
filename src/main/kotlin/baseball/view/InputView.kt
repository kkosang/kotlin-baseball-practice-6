package baseball.view

import INPUT_PREDICTION_NUMBER
import RESTART_GAME_MESSAGE
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun printPredictionNumber(): String {
        print(INPUT_PREDICTION_NUMBER)
        val predictionNumber = Console.readLine()

        return predictionNumber
    }

    fun printRestart(): String {
        println(RESTART_GAME_MESSAGE)
        val restart = Console.readLine()

        return restart
    }
}