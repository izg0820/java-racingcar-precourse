package racingcar.model;

import racingcar.constant.CarStatus;
import racingcar.constant.ErrorMessage;
import racingcar.exception.CustomIllegalArgumentException;

public class Car {

    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = isValidate(name);
        this.position = position;
    }

    private String isValidate(String name) {
        if(name.length() > 5 || name.length() <= 0) {
            throw new CustomIllegalArgumentException(ErrorMessage.CAR_NAME_WRONG.getValue());
        }
        return name;
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
