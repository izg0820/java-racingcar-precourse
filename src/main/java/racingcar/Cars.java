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
        String[] splitCarName = carsName.split(Constant.COMMA);
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < splitCarName.length; i++) {
            cars.add(new Car(splitCarName[i], 0));
        }
        return cars;
    }

    public void move() {
        cars.forEach((car) -> {
            car.setPosition(new RandomNumber());
        });
    }

    public List<Integer> getPositions() {
        List<Integer> positions = new ArrayList<>();
        cars.forEach((car) -> {
            positions.add(car.getPosition());
        });
        return positions;
    }

    public PlayResult findWinner() {
        PlayResult playResult = new PlayResult();
        int max = findMaxPosition(cars);
        cars.forEach((car) ->{
            if (car.getPosition() == max) {
                playResult.report(car);
            }
        });
        return playResult;
    }

    private int findMaxPosition(List<Car> cars) {
        int max = cars.get(0).getPosition();
        for (Car car : cars) {
            if (car.getPosition() > max) {
                max = car.getPosition();
            }
        }
        return max;
    }

    public List<Car> getCars() {
        return cars;
    }
}
