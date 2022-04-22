package racingcar;

public enum Message {
    ENTER_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n"),
    ENTER_REPEAT("시도할 횟수는 몇회인가요?\n"),
    RESULT("실행결과\n"),
    WINNER("최종우승자:");

    private String value;

    Message(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
