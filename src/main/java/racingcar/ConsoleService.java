package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleService {

    public static Repeat read() {
        return new Repeat(Integer.parseInt(Console.readLine()));
    }
}