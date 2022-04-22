package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResultTest {

    @Test
    void move테스트() {
        Cars cars = new Cars("a,b,c");
        cars.move(new RandomNumber(4));
        for (Integer position : cars.getPositions()) {
            assertThat(position).isEqualTo(1);
        }
    }

    @Test
    void 우승자찾기() {
        Cars cars = new Cars("a,b,c");
        Repeat repeatTime = new Repeat(2);
        while (repeatTime.isEnd()) {
            cars.move(new RandomNumber(4));
        }
        PlayResult result = cars.findWinner();
        assertThat(result.printWinner()).isEqualTo("a,b,c");
    }
}
