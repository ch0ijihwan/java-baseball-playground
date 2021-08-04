package model;

import controller.BaseballController;
import model.score.Ball;
import model.score.Strike;

public class BaseBallScore {
    private InputNumbers inputNumbers;
    private final RandomBaseballNumbers randomNumbers;
    private final BaseballController baseballController;

    public BaseBallScore(InputNumbers inputNumbers, RandomBaseballNumbers randomBaseballNumbers) {
        this.inputNumbers = inputNumbers;
        this.randomNumbers = randomBaseballNumbers;
        baseballController = new BaseballController();
    }

    public void guess() {
        int strikeCount = 0;

        while (!isThreeStrike(strikeCount)) {
            baseballController.showResult(Ball.countBall(inputNumbers.getInputNumbers(), randomNumbers.getRandomBaseballNumbers()
            ), Strike.countStrike(inputNumbers.getInputNumbers(), randomNumbers.getRandomBaseballNumbers()));

            inputNumbers = baseballController.newBaseBallInput();
            strikeCount = Strike.countStrike(inputNumbers.getInputNumbers(), randomNumbers.getRandomBaseballNumbers());

        }
        baseballController.threeStrike();
    }
    boolean isThreeStrike(int strikeCount) {
        return strikeCount == 3;
    }
}
