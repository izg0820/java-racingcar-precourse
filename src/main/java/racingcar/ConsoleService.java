package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleService {

    public static Repeat readRepeatTime() {
        return new Repeat(Integer.parseInt(Console.readLine()));
    }

    public static Cars readCarsName() {
        return new Cars(Console.readLine());
    }

    public static void print(Message message) {
        System.out.printf("%s", message);
    }

    public static void printCarsPosition(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.printf("%s:%s", car.getName(), Utils.repeat(Message.POSITION_CHARACTER.getValue(), car.getPosition()));
        }
    }
}
