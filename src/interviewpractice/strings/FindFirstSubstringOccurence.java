package interviewpractice.strings;

/**
 * @author benmakusha
 */

public class FindFirstSubstringOccurence {

    public int findFirstSubstringOccurrence(String s, String x) {
        int sLen = s.length();
        int xLen = x.length();
        int tracker = 0;

        if (sLen == xLen) {
            if (s.equals(x)) {
                return 0;
            } else {
                return -1;
            }
        } else {
            if (xLen >= 1) {
                for (int index = 0; index < sLen; index++) {
                    if (s.charAt(index) == x.charAt(tracker)) {
                        tracker++;
                        if (tracker == xLen) {
                            return index - (xLen - 1);
                        }
                    } else {
                        index -= tracker;
                        tracker = 0;
                    }
                }
            }
        }
        return -1;
    }
}
