package baseball.view

import INPUT_PREDICTION_NUMBER
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun printPredictionNumber(): String {
        print(INPUT_PREDICTION_NUMBER)
        val predictionNumber = Console.readLine()

        return predictionNumber
    }
}