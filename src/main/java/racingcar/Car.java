package racingcar;

public class Car {

    private String name;
    private int position;

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

    public String getName() {
        return this.name;
    }
}
