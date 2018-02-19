package interviewpractice.arrays;

/**
 * @author benmakusha
 */

public class FirstNotRepeatingCharacter {

    public char firstNotRepeatingCharacter(String s) {
        int[] count = new int[26];
        for (int index = 0; index < s.length(); index++) {
            count[s.charAt(index) - 97]++;
        }
        for (int index = 0; index < s.length(); index++) {
            if (count[s.charAt(index) - 97] == 1) {
                return s.charAt(index);
            }
        }
        return '_';
    }
}
