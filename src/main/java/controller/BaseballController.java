package controller;

import model.EvaluationNumber;
import model.GuessNumber;
import model.RandomBaseballNumbers;
import view.Input;
import view.Out;

public class BaseballController {
    private EvaluationNumber checkInput;
    private RandomBaseballNumbers randomBaseballNumbers;
    private GuessNumber guessNumber;

    public void run() {
        checkInput = new EvaluationNumber(Input.InputBaseballNumber());
        randomBaseballNumbers = new RandomBaseballNumbers();
        guessNumber = new GuessNumber(checkInput.getBaseballNumber(), randomBaseballNumbers.outRandomBaseballNumbers());
        guessNumber.guessResult();
    }

    public void sendOut(int ball, int strike) {
        Out.resultOut(ball, strike);
    }
}
