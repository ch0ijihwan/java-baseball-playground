package model;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class RandomBaseballNumbers {
    private static final Random RANDOM = new Random();
    private static final int RANDOM_NUMBER_SIZE = 3;
    private static final int MAX_NUMBER = 9;

    private final Set<String> threeNumbers = new HashSet<>();

    public RandomBaseballNumbers() {
        while (threeNumbers.size() < RANDOM_NUMBER_SIZE) {
            threeNumbers.add(String.valueOf(RANDOM.nextInt(MAX_NUMBER) + 1));
        }
    }

    public List<Number> outRandomBaseballNumbers() {
        return this.threeNumbers.stream().map(value -> new Number(Integer.parseInt(value)))
                .collect(Collectors.toList());
    }
}
