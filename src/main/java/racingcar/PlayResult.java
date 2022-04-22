package racingcar;

import java.util.ArrayList;
import java.util.List;

public class PlayResult {
    List<String> winners;

    public PlayResult() {
        winners = new ArrayList<>();
    }

    public String printWinner() {
        return String.join(",", winners);
    }

    public void report(Car car) {
        winners.add(car.getName());
    }
}
