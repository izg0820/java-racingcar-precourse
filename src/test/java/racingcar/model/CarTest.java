package racingcar.model;

import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.Cars;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차이름_검증() {
        Car car = new Car("abcde", 0);
        assertThat(car.isValidate()).isTrue();
    }

    @Test
    void 자동차이름_split() {
        Cars cars = new Cars("pobi,woni,jun");
        assertThat(cars).isNotNull();
    }
}
