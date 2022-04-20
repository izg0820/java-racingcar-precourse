package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {

    public static final int MIN = 0;
    public static final int MAX = 9;
    public static final int MOVE_CRITERIA = 4;

    private int randomNumber;

    public RandomNumber(int number) {
        this.randomNumber = number;
    }

    public RandomNumber() {
        this.randomNumber = Randoms.pickNumberInRange(MIN, MAX);
    }

    public CarStatus goOrStop() {
        if (this.randomNumber >= MOVE_CRITERIA) {
            return CarStatus.Go;
        }
        return CarStatus.Stop;
    }

}
