package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class InputNumbersTest {
    private InputNumbers inputNumbers;

    @ParameterizedTest
    @CsvSource(value = {"111", "112", "121", "333"})
    @DisplayName("세가지의 수를 받고, 중복되는 수가 있을 경우 예외처리 반환")
    public void DuplicateCheckTest(String values) {
        inputNumbers = new InputNumbers(values);
        assertThrows(IllegalArgumentException.class, () -> inputNumbers.checkInputNumber());
    }
}