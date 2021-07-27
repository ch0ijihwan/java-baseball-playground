package model.score;

import java.util.List;
import java.util.function.Predicate;

public class Ball {
    List<String> inputNumbers;
    List<String> randomNumbers;
    Strike strike;

    public Ball(List<String> inputNumbers, List<String> randomNumbers) {
        this.inputNumbers = inputNumbers;
        this.randomNumbers = randomNumbers;
        strike = new Strike(this.inputNumbers,this.randomNumbers);
    }

    public int countBall() {
        return (int) randomNumbers.stream()
                .filter(randomNumber -> inputNumbers.stream()
                        .anyMatch(Predicate
                                .isEqual(randomNumber))).count() - strike.countStrike();
    }
}

