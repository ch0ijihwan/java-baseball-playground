package model;

import controller.BaseballController;
import model.score.Ball;
import model.score.Strike;
import view.Input;

public class GuessNumber {
    private InputNumbers inputNumbers;
    private RandomBaseballNumbers randomNumbers;
    private final BaseballController baseballController;
    InputNumbers checkInput;

    public GuessNumber(InputNumbers inputNumbers, RandomBaseballNumbers randomBaseballNumbers) {
        this.inputNumbers = inputNumbers;
        this.randomNumbers = randomBaseballNumbers;
        baseballController = new BaseballController();
    }

    public void guessResult() {
        int strikeCount = 0;

        while (true) {
            strikeCount = Strike.countStrike(inputNumbers.getInputNumbers(), randomNumbers.getRandomBaseballNumbers());

            if (isThreeStrike(strikeCount)) break;

            baseballController.guessResult(Ball.countBall(inputNumbers.getInputNumbers(), randomNumbers.getRandomBaseballNumbers())
                    , Strike.countStrike(inputNumbers.getInputNumbers(), randomNumbers.getRandomBaseballNumbers()));
            checkInput = new InputNumbers(Input.InputBaseballNumber());
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
