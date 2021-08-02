package controller;

import model.GuessNumber;
import model.InputNumbers;
import model.RandomBaseballNumbers;
import view.Input;
import view.Out;

public class BaseballController {
    private InputNumbers checkInput;
    private RandomBaseballNumbers randomBaseballNumbers;
    private GuessNumber guessNumber;

    public void run() {
        checkInput = new InputNumbers(Input.InputBaseballNumber());
        randomBaseballNumbers = new RandomBaseballNumbers();
        guessNumber = new GuessNumber(checkInput.getInputNumbers(), randomBaseballNumbers.getRandomBaseballNumbers());
        guessNumber.guessResult();
    }

    public void sendOut(int ball, int strike) {
        Out.resultOut(ball, strike);
    }
}
