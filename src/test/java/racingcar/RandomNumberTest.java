package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberTest {

    @Test
    public void 전진테스트() {
        RandomNumber number = new RandomNumber(4);
        assertThat(number.goOrStop()).isEqualTo(CarStatus.Go);
    }

    @Test
    public void 정지테스트() {
        RandomNumber number = new RandomNumber(3);
        assertThat(number.goOrStop()).isEqualTo(CarStatus.Stop);
    }

    @Test
    public void 랜덤함수로생성된값테스트() {
        RandomNumber number = new RandomNumber(Randoms.pickNumberInRange(RandomNumber.MIN, RandomNumber.MAX));
        assertThat(number.goOrStop()).isExactlyInstanceOf(CarStatus.class);
    }
}
