package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class InputNumbers {
    private final Set<Number> values;

    public InputNumbers(String value) {
        values = new LinkedHashSet<>();
        int[] a = Arrays.stream(value.split("")).mapToInt(Integer::parseInt).toArray();

        IntStream.range(0, 3)
                .forEach(index -> values.add(new Number(a[index])));
    }

    public Set<Number> getInputNumbers() {
        return this.values;
    }

    public Set<Number> checkInputNumber() {
        if (!isValueSize()) {
            throw new IllegalArgumentException("입력수가 중복되는 수가 있거나, 3자리 이상입니다.");
        }
        return this.values;
    }

    private boolean isValueSize() {
        return new HashSet<>(this.values).size() == 3;
    }
}