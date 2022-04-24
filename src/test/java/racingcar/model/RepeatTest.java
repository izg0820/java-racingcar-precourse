package racingcar.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.exception.CustomIllegalArgumentException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RepeatTest {

    @Test
    void 입력값테스트() {
        assertThatThrownBy(() -> {
            new Repeat("12E");
        }).isInstanceOf(CustomIllegalArgumentException.class).hasMessage("시도할 횟수는 숫자여야 합니다.");
    }

}
