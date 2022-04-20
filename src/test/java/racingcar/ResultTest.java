package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResultTest {

    @Test
    void move테스트() {
        Cars cars = new Cars("a,b,c");
        cars.move();
        for (Integer position : cars.getPositions()) {
            assertThat(position).isBetween(0, 1);
        }

    }
}
