package controller;

import model.CheckInput;
import model.GuessNumber;
import model.RandomBaseballNumbers;
import view.Input;
import view.Out;

public class BaseballController {
    private CheckInput checkInput;
    private RandomBaseballNumbers randomBaseballNumbers;
    private GuessNumber guessNumber;

    public void run() {
        checkInput = new CheckInput(Input.InputBaseballNumber());
        randomBaseballNumbers = new RandomBaseballNumbers();
        guessNumber = new GuessNumber(checkInput.checkInputNumber(), randomBaseballNumbers.outRandomBaseballNumbers());
        guessNumber.guessResult();
    }
    public void sendOut(int ball, int strike){
        Out.resultOut(ball,strike);
    }
}
