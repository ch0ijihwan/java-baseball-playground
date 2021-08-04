package controller;

import model.GuessNumber;
import model.InputNumbers;
import model.RandomBaseballNumbers;
import view.Out;

import static view.Input.AskNewGame;
import static view.Input.InputBaseballNumber;
import static view.Out.showGameStart;

public class BaseballController {
    private InputNumbers checkInput;
    private RandomBaseballNumbers randomBaseballNumbers;
    private GuessNumber guessNumber;

    public void run() {
        boolean newGame = true;
        while (newGame) {
            showGameStart();
            checkInput = new InputNumbers(InputBaseballNumber());
            randomBaseballNumbers = new RandomBaseballNumbers();
            guessNumber = new GuessNumber(checkInput, randomBaseballNumbers);
            guessNumber.guess();
            newGame = AskNewGame();
        }
    }

    public void guessResult(int ball, int strike) {
        Out.resultOut(ball, strike);
    }

    public void threeStrike() {
        Out.threeStrike();
    }
}
