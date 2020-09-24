package arcadeUniverse.intro;

/**
 * @author benmakusha
 */
public class _18PalindromeRearranging {

    boolean palindromeRearranging(String inputString) {
        int count = 0;

        while(inputString.length() > 0) {
            String toRemove = String.valueOf(inputString.charAt(0));
            String temp = inputString.replaceAll(toRemove, "");
            int diff = inputString.length() - temp.length();
            count = diff % 2 == 0 ? count : count + 1;
            inputString = temp;
        }
        return count < 2;
    }
}
