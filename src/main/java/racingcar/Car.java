package racingcar;

public class Car {
    private String name;

    private final static int CAR_NAME_MAX_LENGTH = 5;

    public Car(String name) {
        this.name = name;
    }

    public boolean isValidate() {
        return this.name.length() <= 5;
    }
}
