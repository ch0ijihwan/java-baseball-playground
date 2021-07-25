package model.score;

import java.util.List;
import java.util.stream.IntStream;

public class Strike {
    private final List<String> inputNumbers;
    private final List<String> randomNumbers;


    public Strike(List<String> inputNumbers, List<String> randomNumbers) {
        this.inputNumbers = inputNumbers;
        this.randomNumbers = randomNumbers;
    }

    public int countStrike() {
        boolean[] strikeCount = new boolean[3];

        IntStream.range(0, inputNumbers.size())
                .forEach(index -> strikeCount[index] = compareValues(index));

        return booleanCount(strikeCount);
    }

    boolean compareValues(int index) {
        return this.inputNumbers.get(index).equals(randomNumbers.get(index));
    }

    int booleanCount(boolean[] strikeCount) {
        int count = 0;
        for (boolean strike : strikeCount) {
            if (strike) {
                count++;
            }
        }
        return count;
    }
}
