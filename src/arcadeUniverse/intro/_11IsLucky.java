package arcadeUniverse.intro;

/**
 * @author benmakusha
 */
public class _11IsLucky {

    boolean isLucky(int n) {
        int sum1 = 0;
        int sum2 = 0;
        String str = Integer.toString(n);
        int strLen = str.length();
        int halfLen = strLen / 2;
        for (int i = 0; i < halfLen; i++) {
            sum1 = sum1 + Character.getNumericValue(str.charAt(i));
        }
        for (int x = halfLen; x < strLen; x++) {
            sum2 = sum2 + Character.getNumericValue(str.charAt(x));
        }

        return sum1 == sum2;
    }
}
