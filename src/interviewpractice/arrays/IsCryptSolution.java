package interviewpractice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author benmakusha
 */

public class IsCryptSolution {

    public boolean isCryptSolution(String[] crypt, char[][] solution) {

        Map<Character, Integer> strMap = new HashMap<>();

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

    // implementation fails on leading zero problem
    boolean isCryptSolution2(String[] crypt, char[][] solution) {
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < crypt.length - 1; i++) {
            values.add(findNumericConversion(crypt[i], solution));
        }
        int cryptAddition = values.get(0) + values.get(1);
        int last = findNumericConversion(crypt[2], solution);
        return cryptAddition == last;
    }

    int findNumericConversion(String str, char[][] solution) {
        int strLen = str.length();
        int index = 0;
        String res = "";
        while (strLen > index) {
            for (int i = 0; i < solution.length; i++) {
                if (solution[i][0] == str.charAt(index)) {
                    res += solution[i][1];
                    index++;
                    break;
                }
            }
        }

        return Integer.parseInt(res);
    }

}
