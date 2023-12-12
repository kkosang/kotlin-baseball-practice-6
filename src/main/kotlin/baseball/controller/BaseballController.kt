package baseball.controller

import baseball.view.OutputView

class BaseballController {
    private val outputView = OutputView()

    fun gameStart() {
        outputView.printStartMessage()
    }
}