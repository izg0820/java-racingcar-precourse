package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {

    public static final int MIN = 0;
    public static final int MAX = 9;

    private int randomNumber;

    public RandomNumber(int number) {
        this.randomNumber = number;
    }

    public CarStatus goOrStop() {
        if (this.randomNumber >= 4) {
            return CarStatus.Go;
        }
        return CarStatus.Stop;
    }

}
