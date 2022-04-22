package racingcar;

public class GameController {

    public void start() {
        Cars cars = readCarsName();
        Repeat repeat = readRepeatTime();
        playGame(cars, repeat);
        playResult(cars);
    }

    private void playResult(Cars cars) {
        PlayResult result = cars.findWinner();
        ConsoleUtil.print(Message.WINNER);
        ConsoleUtil.print(result.resultSetting());
    }

    private void playGame(Cars cars, Repeat repeat) {
        while (!repeat.isEnd()) {
            cars.move();
            ConsoleUtil.printCarsPosition(cars);
            repeat.reduce();
        }
    }

    private Repeat readRepeatTime() {
        ConsoleUtil.print(Message.ENTER_REPEAT);
        return ConsoleUtil.readRepeatTime();
    }

    private Cars readCarsName() {
        ConsoleUtil.print(Message.ENTER_CAR_NAMES);
        return ConsoleUtil.readCarsName();
    }
}
