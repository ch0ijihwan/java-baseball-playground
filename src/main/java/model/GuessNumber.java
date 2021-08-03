package model;

import controller.BaseballController;
import model.score.Ball;
import model.score.Strike;
import view.Input;

public class GuessNumber {
    private InputNumbers inputNumbers;
    private final RandomBaseballNumbers randomNumbers;
    private final BaseballController baseballController;


    public GuessNumber(InputNumbers inputNumbers, RandomBaseballNumbers randomBaseballNumbers) {
        this.inputNumbers = inputNumbers;
        this.randomNumbers = randomBaseballNumbers;
        baseballController = new BaseballController();
    }

    public void guess() {
        int strikeCount = 0;

        while (!isThreeStrike(strikeCount)) {
            baseballController.guessResult(Ball.countBall(inputNumbers.getInputNumbers(), randomNumbers.getRandomBaseballNumbers()
            ), Strike.countStrike(inputNumbers.getInputNumbers(), randomNumbers.getRandomBaseballNumbers()));

            this.inputNumbers = new InputNumbers(Input.InputBaseballNumber());
            strikeCount = Strike.countStrike(inputNumbers.getInputNumbers(), randomNumbers.getRandomBaseballNumbers());
        }
        baseballController.threeStrike();
    }

    boolean isThreeStrike(int strikeCount) {
        if (strikeCount == 3) {
            System.out.println("3 스트라이크!");
            return true;
        }
        return false;
    }
}
