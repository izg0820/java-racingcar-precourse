package racingcar.model;

import racingcar.constant.Constant;
import racingcar.constant.ErrorMessage;
import racingcar.exception.CustomIllegalArgumentException;

public class Repeat {

    private int repeatNumber;

    public Repeat(String repeatNumber) {
        this.repeatNumber = isValidate(repeatNumber);
    }

    public int isValidate(String repeatNumber) {
        if (!repeatNumber.matches(Constant.numericRegEx)) {
            throw new CustomIllegalArgumentException(ErrorMessage.REPEAT_TIME_WRONG.getValue());
        }
        return Integer.parseInt(repeatNumber);
    }

    public boolean isEnd() {
        return repeatNumber == 0;
    }

    public void reduce() {
        this.repeatNumber--;
    }
}
