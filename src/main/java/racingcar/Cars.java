package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(String carsName) {
        this.cars = splitCarsName(carsName);
    }

    private List<Car> splitCarsName(String carsName) {
        String[] splitCarName = carsName.split(",");
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < splitCarName.length; i++) {
            cars.add(new Car(splitCarName[i]));
        }
        return cars;
    }

}
