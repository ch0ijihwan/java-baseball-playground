package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class MakeRandomBaseballTest {

    private MakeRandomBaseball makeRandomBaseball;
    private Set<String> input;

    @BeforeEach
    void setUp() {
        makeRandomBaseball = new MakeRandomBaseball();
        Set<String> input = new HashSet<>();
    }

    @Test
    @DisplayName("숫자 야구 게임을 위한 무작위 난수 생성. 3자리 수 숫자 반환")
    public void makeNumber() {
        assertThat(makeRandomBaseball.outRandomBaseball(input).size()).isEqualTo(3);
    }
}