package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumberTest {
    private Number number;

    @ParameterizedTest
    @CsvSource(value = {"0", "10"})
    @DisplayName("수가 1보다 작거나 9 보다 크면 예외처리를 반환")
    public void greaterThanZeroAndLessThanTen(String input) {
        assertThatThrownBy(() -> number = new Number(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("수가 1보다 작거나, 9보다 큰 수 입니다.");
    }

    @ParameterizedTest
    @CsvSource(value = {"=", "+", "%", "a", "c", "?"})
    @DisplayName("받은 값이 숫자가 아닌경우 예외처리를 반환")
    public void isNumber(String value) {
        assertThatThrownBy(() -> Number.isNumber(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자가 아닙니다.");
    }
}