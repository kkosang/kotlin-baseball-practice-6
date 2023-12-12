package baseball.domain

import camp.nextstep.edu.missionutils.Randoms

class ComputerNumber {
    fun generateRandomNumber(): String {
        val computer = mutableListOf<Int>()
        while (computer.size < 3) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber)
            }
        }

        return computer.joinToString("")
    }
}