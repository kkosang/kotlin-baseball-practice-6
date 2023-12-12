package baseball.controller

import baseball.domain.ComputerNumber
import baseball.domain.CountBallStrike
import baseball.domain.PredictionNumber
import baseball.view.InputView
import baseball.view.OutputView

class BaseballController {
    private val outputView = OutputView()
    private val inputView = InputView()

    fun gameStart() {
        outputView.printStartMessage()

        var isGameFinish = false
        while (!isGameFinish) {
            val predictionNumber = inputPredictionNumber()
            val computerNumber = generateComputerNumber()
            val result = CountBallStrike(predictionNumber, computerNumber).count()
            isGameFinish = result.third
        }
    }

    fun inputPredictionNumber(): String {
        val input = inputView.printPredictionNumber()
        PredictionNumber(input).validate()

        return input
    }

    fun generateComputerNumber(): String {
        val computerNumber = ComputerNumber().generateRandomNumber()

        return computerNumber
    }
}