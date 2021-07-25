package model.score;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StrikeTest {
    private Strike strike;

    @BeforeEach
    void setUp() {
        List<String> inputNumbers = Arrays.asList("1", "2", "3");
        List<String> randomNumbers = Arrays.asList("1", "2", "3");
        strike = new Strike(inputNumbers, randomNumbers);
    }

    @ParameterizedTest
    @CsvSource(value = {"1 2 3,1 2 3,3","1 2 3,4 5 6,0", "1 2 5,1 2 4,2"})
    void strikeCounts(String input, String randomNumbers, int expect) {


        List<String> numbers1 = Arrays.asList(divValue(input));
        List<String> numbers2 = Arrays.asList(divValue(randomNumbers));

        strike = new Strike(numbers1, numbers2);

        assertThat(strike.countStrike()).isEqualTo(expect);
    }

    String[]  divValue(String value){
        return value.split(" ");
    }

    @Test
    @DisplayName("숫자 리스트 두개를 받아. 각 순서와 숫자가 같은 수 인 스트라이크의 갯수를 반환")
    public void strikeCount() {

        assertThat(strike.countStrike()).isEqualTo(3);
    }


}