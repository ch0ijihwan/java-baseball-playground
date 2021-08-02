package model;

import controller.BaseballController;
import model.score.Ball;
import model.score.Strike;
import view.Input;

import java.util.Set;

public class GuessNumber {
    private Set<Number> inputNumbers;
    private final Set<Number> randomNumbers;
    private final BaseballController baseballController;
    InputNumbers checkInput;

    public GuessNumber(Set<Number> inputNumbers, Set<Number> randomNumbers) {
        baseballController = new BaseballController();
        this.inputNumbers = inputNumbers;
        this.randomNumbers = randomNumbers;
    }

    public void guessResult() {
        int strikeCount = 0;

        while (true) {
            strikeCount = Strike.countStrike(inputNumbers, randomNumbers);

            if (isThreeStrike(strikeCount)) break;

            baseballController.sendOut(Ball.countBall(inputNumbers, randomNumbers), Strike.countStrike(inputNumbers, randomNumbers));
            checkInput = new InputNumbers(Input.InputBaseballNumber());
            this.inputNumbers = checkInput.checkInputNumber();
        }
    }

    boolean isThreeStrike(int strikeCount) {
        if (strikeCount == 3) {
            System.out.println("3 스트라이크!");
            return true;
        }
        return false;
    }
}
