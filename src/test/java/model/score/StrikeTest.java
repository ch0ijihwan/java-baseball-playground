package model.score;

import model.Number;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class StrikeTest {

    @ParameterizedTest
    @MethodSource("strikeCountParameterProvider")
    @DisplayName("4가지 두 Set을 받아 스트라이크의 개수를 반환한다.")
    public void getStrikeCount(Set<Number>inputNumbers, Set<Number> randomNumbers, int expect){
        int count = Strike.countStrike(inputNumbers,randomNumbers);
        assertThat(count).isEqualTo(expect);
    }
    static Stream<Arguments> strikeCountParameterProvider() {
        return Stream.of(arguments(new LinkedHashSet<>(Arrays.asList(new Number("1"), new Number("2"), new Number("3"))),
                        new LinkedHashSet<>(Arrays.asList(new Number("1"), new Number("2"), new Number("3"))), 3),
                arguments(new LinkedHashSet<>(Arrays.asList(new Number("1"), new Number("2"), new Number("3"))),
                        new LinkedHashSet<>(Arrays.asList(new Number("6"), new Number("2"), new Number("3"))), 2),
                arguments(new LinkedHashSet<>(Arrays.asList(new Number("1"), new Number("2"), new Number("3"))),
                        new LinkedHashSet<>(Arrays.asList(new Number("7"), new Number("6"), new Number("3"))), 1),
                arguments(new LinkedHashSet<>(Arrays.asList(new Number("1"), new Number("2"), new Number("3"))),
                        new LinkedHashSet<>(Arrays.asList(new Number("4"), new Number("5"), new Number("6"))), 0)
        );
    }
}