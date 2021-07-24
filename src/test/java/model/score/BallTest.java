package model.score;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BallTest {

    @Test
    @DisplayName("(두 리스트 값이 다 같은 경우) 두개의 리스트를 받아, 각 리스트에 같은 값이 몇개인지 반환")
    public void guess() {


        List<String> input = Arrays.asList("1", "2", "3");
        List<String> random = Arrays.asList("1", "2", "3");
        Ball ball = new Ball(input, random);
        assertThat(ball.countBall()).isEqualTo(3);
    }


    @Test
    @DisplayName("(두 리스트 중 하나의 요소 값만 다른 경우) 두개의 리스트를 받아, 각 리스트에서 볼 값을 반환")
    public void guess_1() {


        List<String> input = Arrays.asList("1", "8", "3");
        List<String> random = Arrays.asList("1", "2", "3");
        Ball ball = new Ball(input, random);
        assertThat(ball.countBall()).isEqualTo(2);
    }


    @Test
    @DisplayName("(두 리스트 값이 모두 다른 경우) 두개의 리스트를 받아, 각 리스트에서 볼 값을 반환")
    public void guess_2() {


        List<String> input = Arrays.asList("1", "2", "3");
        List<String> random = Arrays.asList("4", "5", "6");
        Ball ball = new Ball(input, random);
        assertThat(ball.countBall()).isEqualTo(0);
    }

}