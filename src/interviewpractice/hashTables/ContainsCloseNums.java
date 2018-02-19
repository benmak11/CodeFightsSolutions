package interviewpractice.hashTables;

import java.util.HashMap;
import java.util.Map;

/**
 * @author benmakusha
 */

public class ContainsCloseNums {


    public boolean containsCloseNums(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int number = nums[index];
            if (map.containsKey(number) && index - map.get(number) <= k) {
                return true;
            }
            map.put(number, index);
        }
        return false;
    }

    // TODO: Implementation works for first test case
//    public boolean subParContainsCloseNums(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int mappingValue = 0;
//        int lastPos = 0;
//
//        if (nums.length > 0) {
//            for (int i = 0; i < nums.length; i++) {
//                if (!map.containsKey(nums[i])) {
//                    map.put(nums[i], i);
//                } else {
//                    lastPos = i;
//                    mappingValue = nums[i];
//                }
//            }
//
//            int distinctOne = 0;
//            int distinctTwo = 0;
//
//            if (nums.length == 2) {
//                if (nums[0] == nums[1]) {
//                    for (Integer i : map.values()) {
//                        if (i == 0) {
//                            distinctOne = i;
//                        } else {
//                            distinctTwo = i;
//                        }
//                    }
//                }
//            } else {
//                distinctOne = map.get(mappingValue);
//                distinctTwo = lastPos;
//            }
//
//            if (Math.abs(distinctOne - distinctTwo) <= k) {
//                return true;
//            }
//        }
//
//        return false;
//    }

}
