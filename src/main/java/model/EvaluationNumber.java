package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class EvaluationNumber {
    private final List<Number> values;

    public EvaluationNumber(String value) {
        String[] splitValues = splitValues(value);
        this.values = Arrays.stream(splitValues)
                .map(splitValue -> new Number(Integer.parseInt(splitValue))).collect(Collectors.toList());

    }

    public List<Number> getBaseballNumber() {
        return this.values;
    }

    public List<Number> checkInputNumber() {
        if (!isValueSizeOK()) {
            throw new IllegalArgumentException("입력수가 중복되는 수가 있거나, 3자리 이상입니다.");
        }
        return this.values;
    }

    private boolean isValueSizeOK() {

        return new HashSet<>(this.values).size() == 3;
    }

    private String[] splitValues(String value) {
        return value.split("");
    }

    public List<Number> getInputValues() {
        return this.values;
    }

}
