package interviewpractice.commonTechniquesBasic;

import java.util.HashMap;

/**
 * @author benmakusha
 */
public class FindLongestSubarrayBySum {

    int[] findLongestSubarrayBySum(int s, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int max = 0;
        int[] result = new int[2];
        for (int index = 0; index < arr.length; index++) {
            currentSum += arr[index];
            if (currentSum == s) {
                max = index + 1;
                result[0] = 1;
                result[1] = index + 1;
            }
            if (map.containsKey(currentSum - s)) {
                if (max < index - map.get(currentSum - s)) {
                    max = index - map.get(currentSum - s);
                    result[0] = map.get(currentSum - s) + 2;
                    result[1] = index + 1;
                }
            }
            map.put(currentSum, index);
        }
        if (max == 0)
            return new int[]{-1};

        return result;
    }
}
