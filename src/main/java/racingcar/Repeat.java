package racingcar;

public class Repeat {
    private String repeatNumber;

    private static final String regEx = "^[0-9]*$";

    public Repeat(String repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    public boolean isValidate() {
        return this.repeatNumber.matches(regEx);
    }
}
