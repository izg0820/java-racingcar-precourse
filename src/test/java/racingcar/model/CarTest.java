package racingcar.model;

import org.junit.jupiter.api.Test;
import racingcar.exception.CustomIllegalArgumentException;
import racingcar.model.Car;
import racingcar.model.Cars;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차이름_검증() {
        assertThatThrownBy(() -> {
            new Car("abcdef", 0);
        }).isInstanceOf(CustomIllegalArgumentException.class).hasMessageContaining("1자 이상 5자 이하");
    }

    @Test
    void 자동차이름_split() {
        Cars cars = new Cars("pobi,woni,jun");
        assertThat(cars).isNotNull();
    }
}
