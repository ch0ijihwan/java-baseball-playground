package view;

import java.util.Scanner;

public class Input {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static String InputBaseballNumber()
    {
        return SCANNER.next();
    }
    public static boolean askNewGame(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return SCANNER.nextInt() == 1;
    }
}
