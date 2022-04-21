package racingcar;

public class Repeat {
    private int repeatNumber;

    private static final String regEx = "^[0-9]*$";

    public Repeat(int repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    public boolean isValidate() {
        return String.valueOf(this.repeatNumber).matches(regEx);
    }
}
