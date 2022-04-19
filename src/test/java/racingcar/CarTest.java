package racingcar;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차이름_검증() {
        Car car = new Car("abcde");
        assertThat(car.isValidate()).isTrue();
    }

    @Test
    void 자동차이름_split() {
        Cars cars = new Cars("pobi,woni,jun");
        assertThat(cars).isNotNull();
    }
}
