package model;

import java.util.*;

public class RandomBaseballNumbers {
    private static final Random RANDOM = new Random();
    private static final int RANDOM_NUMBER_SIZE = 3;
    private static final int MAX_NUMBER = 9;

    private List<String> randomBaseballNumber;
    private final Set<String> threeNumbers = new HashSet<>();

    public RandomBaseballNumbers() {
        while (threeNumbers.size() < RANDOM_NUMBER_SIZE) {
            threeNumbers.add(String.valueOf(RANDOM.nextInt(MAX_NUMBER) + 1));
        }
    }

    public List<String> outRandomBaseball() {
        return this.randomBaseballNumber = new ArrayList<>(this.threeNumbers);
    }
}
