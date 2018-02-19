package interviewpractice.strings;

/**
 * @author benmakusha
 */

public class AmendTheSentence {

    public String amendTheSentence(String s) {
        String result = "";
        int upperCaseTracker = 0;
        for (int index = 0; index < s.length(); index++) {
            if (index != 0 && Character.isUpperCase(s.charAt(index))) {
                result += s.substring(upperCaseTracker, index) + " ";
                upperCaseTracker = index;
                result = result.toLowerCase();
            }
            if (index == s.length() - 1) {
                result += s.substring(upperCaseTracker, s.length());
                result = result.toLowerCase();
            }
        }
        return result;
    }
}
