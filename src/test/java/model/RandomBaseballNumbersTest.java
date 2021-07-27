package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomBaseballNumbersTest {
    private RandomBaseballNumbers makeRandomBaseball;

    @BeforeEach
    void setUp() {
        makeRandomBaseball = new RandomBaseballNumbers();
    }

    @Test
    @DisplayName("숫자 야구 게임을 위한 무작위 난수 생성. 3자리 수 숫자 반환")
    public void makeNumber() {
        assertThat(makeRandomBaseball
                .outRandomBaseballNumbers()
                .size()).isEqualTo(3);
    }
}