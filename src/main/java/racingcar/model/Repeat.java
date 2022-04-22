package racingcar.model;

import racingcar.constant.Constant;

public class Repeat {

    private int repeatNumber;

    public Repeat(int repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    public boolean isValidate() {
        return String.valueOf(this.repeatNumber).matches(Constant.numericRegEx);
    }

    public boolean isEnd() {
        return repeatNumber == 0;
    }

    public void reduce() {
        this.repeatNumber--;
    }
}