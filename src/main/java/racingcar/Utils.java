package racingcar;

public class Utils {

    public static String repeat(String s, int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
