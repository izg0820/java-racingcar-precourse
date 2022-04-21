package racingcar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InputTest {

    @ParameterizedTest
    @CsvSource(value = {"123:true", "12E:false"}, delimiter = ':')
    void 입력값테스트(String input, String expected) {
        Repeat repeat = new Repeat(input);
        assertThat(repeat.isValidate()).isEqualTo(Boolean.parseBoolean(expected));
    }

}
