package baseball.controller

import baseball.view.InputView
import baseball.view.OutputView

class BaseballController {
    private val outputView = OutputView()
    private val inputView = InputView()

    fun gameStart() {
        outputView.printStartMessage()
        inputPredictionNumber()
    }

    fun inputPredictionNumber() {
        val input = inputView.printPredictionNumber()
        
    }
}