package arcadeUniverse.intro;

import java.util.HashMap;
import java.util.Map;

/**
 * @author benmakusha
 */
public class _21IPv4Address {

    boolean isIPv4Address(String inputString) {
        String[] ips = inputString.split("\\.");

        if (ips.length != 4)
            return false;

        for (int i = 0; i < ips.length; i++) {
            if (ips[i].length() == 0)
                return false;

            try {
                if (checkNoLeadingZeros(ips[i])) {
                    int n = Integer.parseInt(ips[i]);
                    if (n < 0 || n > 255)
                        return false;
                } else
                    return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    boolean checkNoLeadingZeros(String input) {
        Map<Integer, Integer> leadingZerosMap = new HashMap<>();
        if (input.length() > 1) {
            leadingZerosMap.put(1, Character.getNumericValue(input.charAt(0)));
            leadingZerosMap.put(2, Character.getNumericValue(input.charAt(1)));
            if (leadingZerosMap.size() != 0) {
                if (leadingZerosMap.get(1) == 0 && leadingZerosMap.get(2) == 0)
                    return false;
                if (leadingZerosMap.get(1) == 0)
                    return false;
            }
        }

        return true;
    }

}
