package model;

import java.util.Objects;

public class Number {
    private final int number;

    public Number(int number) {
        this.number = number;
    }

    public int getValue() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number that = (Number) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}