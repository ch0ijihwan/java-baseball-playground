package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CheckInput {
    private final List<String> values;

    public CheckInput(String value) {
        this.values = Arrays.asList(divValues(value));
        checkInputNumber();
    }

    public List<String> checkInputNumber() {
        if (!isValueSizeOK()) {
            throw new IllegalArgumentException("입력수가 이상합니다.");
        }
        return this.values;
    }

    private boolean isValueSizeOK() {
        return new HashSet<>(this.values).size() == 3;
    }

    private String[] divValues(String value) {
        return value.split("");

    }
}
