package baseball.controller

import baseball.domain.ComputerNumber
import baseball.domain.PredictionNumber
import baseball.view.InputView
import baseball.view.OutputView

class BaseballController {
    private val outputView = OutputView()
    private val inputView = InputView()

    fun gameStart() {
        outputView.printStartMessage()
        val predictionNumber = inputPredictionNumber()
        val computerNumber = generateComputerNumber()
    }

    fun inputPredictionNumber(): Int {
        val input = inputView.printPredictionNumber()
        val predictionNumber = PredictionNumber(input)
        predictionNumber.validate()

        return predictionNumber.toInt()
    }

    fun generateComputerNumber(): String {
        val computerNumber = ComputerNumber().generateRandomNumber()

        return computerNumber
    }
}