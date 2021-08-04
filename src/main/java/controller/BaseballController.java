package controller;

import model.BaseBallScore;
import model.InputNumbers;
import model.RandomBaseballNumbers;
import view.Out;

import static view.Input.AskNewGame;
import static view.Input.InputBaseballNumber;
import static view.Out.showGameStart;

public class BaseballController {
    private InputNumbers checkInput;
    private RandomBaseballNumbers randomBaseballNumbers;
    private BaseBallScore guessNumber;

    public void run() {
        boolean newGame = true;
        while (newGame) {
            showGameStart();
            checkInput = new InputNumbers(InputBaseballNumber());
            randomBaseballNumbers = new RandomBaseballNumbers();
            guessNumber = new BaseBallScore(checkInput, randomBaseballNumbers);
            guessNumber.guess();
            newGame = AskNewGame();
        }
    }

    public void showResult(int ball, int strike) {
        Out.showResult(ball, strike);
    }

    public void threeStrike() {
        Out.threeStrike();
    }
    public InputNumbers newBaseBallInput(){
        checkInput = new InputNumbers(InputBaseballNumber());
        return checkInput;
    }
}
