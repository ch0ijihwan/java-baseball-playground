import controller.BaseballController;

import static view.Input.AskNewGame;

public class Main {
    public static void main(String[] args) {
        boolean newGame = true;
        while (newGame) {
            System.out.println("숫자 야구 게임을 시작합니다.");
            BaseballController baseballController = new BaseballController();
            baseballController.run();
            newGame = AskNewGame();
        }


    }
}