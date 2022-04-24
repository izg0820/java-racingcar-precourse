package racingcar.constant;

public enum ErrorMessage {

    CAR_NAME_WRONG("자동차 이름은 1자 이상 5자 이하입니다.");

    private final String value;

    ErrorMessage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
