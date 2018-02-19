package interviewpractice.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author benmakusha
 */

public class IsCryptSolution {

    public boolean isCryptSolution(String[] crypt, char[][] solution) {

        Map<Character, Integer> strMap = new HashMap<Character, Integer>();

        for (int index = 0; index < solution.length; ++index) {
            strMap.put(solution[index][0], (int)solution[index][1] - (int)'0');
        }
        int[] numbers = new int[crypt.length];
        for (int index = 0; index < crypt.length; index++) {
            String word = crypt[index];
            int number = 0;
            int tens = 1;
            for (int j = word.length() - 1; j >= 0; --j) {
                int digit = strMap.get(word.charAt(j));
                if (j == 0 && digit == 0 && word.length() > 1) {
                    return false;
                }
                number += digit * tens;
                tens *= 10;
            }
            numbers[index] = number;
        }
        return numbers[0] + numbers[1] == numbers[2];
    }

}
