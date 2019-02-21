/**
 * Created by CM on 21/02/2019.
 */
public class Temp {
    public enum Warning {NONE, YELLOW, ORANGE, RED, BLACK};
    public static Warning getWarning(int temp) {
        if (temp < -60 || temp > 60) throw new IllegalArgumentException();
        if (temp >= -5 && temp <= 30) return Warning.NONE;
        if ((temp >= -10 && temp < -5) && ((temp > 30 && temp <= 35))) return Warning.YELLOW;
        if ((temp >= -15 && temp < -10) || ((temp > 35 && temp <= 40))) return Warning.ORANGE;
        if (temp >= -20 && temp < -15) return Warning.RED;
        return Warning.BLACK;
    }
}
