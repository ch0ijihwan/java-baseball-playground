package model;

import java.util.LinkedHashSet;
import java.util.Set;

import static util.RandomUtil.generateRandomNumber;

public class RandomBaseballNumbers {
    private static final int RANDOM_NUMBER_SIZE = 3;
    private final Set<Number> threeNumbers = new LinkedHashSet<>();

    public RandomBaseballNumbers() {
        while (threeNumbers.size() < RANDOM_NUMBER_SIZE) {
            threeNumbers.add(String.valueOf(RANDOM.nextInt(MAX_NUMBER) + 1));
        }
    }

    public Set<Number> getRandomBaseballNumbers() {
        return this.threeNumbers;
    }
}