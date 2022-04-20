package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

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
            cars.add(new Car(splitCarName[i], 0));

        }
        return cars;
    }

    public void move() {
        for (Car car : cars) {
            car.setPosition(new RandomNumber());
        }
    }

    public List<Integer> getPositions() {
        List<Integer> positions = new ArrayList<>();
        for (Car car : cars) {
            positions.add(car.getPosition());
        }
        return positions;
    }
}
