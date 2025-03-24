package th.p1.bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {
    static int getLength(String x) {
        return x.length();
    }

    static String firstThreeCharacters(String x) {
        return x.substring(0, 3);
    }

    static String lastThreeCharacters(String x) {
        return x.substring(x.length() - 4, 3);
    }

    static String characterAtSixthPosition(String x) {
        if (x.length() < 6)
            return "Invalid string";
        else
            return Character.toString(x.charAt(6));
    }

    static String concatFromXAndY(String x, String y) {
        return firstThreeCharacters(x) + lastThreeCharacters(y);
    }

    static Boolean isXYEquals(String x, String y) {
        return x.equals(y);
    }

    static Boolean isXYEqualsIgnoreCase(String x, String y) {
        return x.equalsIgnoreCase(y);
    }

    static Integer isYExistsInX(String x, String y) {
        Boolean isExists = x.contains(y);
        if (!isExists)
            return -1;
        else
            return x.indexOf(y);
    }

    static String getAllYPositionInX(String x, String y) {
        List<Integer> l = new ArrayList<Integer>();

        return l.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }
}
