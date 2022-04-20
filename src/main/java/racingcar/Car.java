package racingcar;

public class Car {
    private String name;
    private int position;

    private final static int CAR_NAME_MAX_LENGTH = 5;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public boolean isValidate() {
        return this.name.length() <= 5;
    }

    public void setPosition(RandomNumber randomNumber) {
        if (randomNumber.goOrStop() == CarStatus.Go) {
            this.position++;
        }
    }

    public Integer getPosition() {
        return this.position;
    }
}
