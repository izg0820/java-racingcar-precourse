package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {

    private int randomNumber;

    public RandomNumber(int number) {
        this.randomNumber = number;
    }

    public RandomNumber() {
        this.randomNumber = Randoms.pickNumberInRange(Constant.RANDOM_MIN, Constant.RANDOM_MAX);
    }

    public CarStatus goOrStop() {
        if (this.randomNumber >= Constant.MOVE_CRITERIA) {
            return CarStatus.Go;
        }
        return CarStatus.Stop;
    }
}
