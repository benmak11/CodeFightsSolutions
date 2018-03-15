package interviewpractice.dynamicprogrammingbasic;

import java.util.ArrayList;

/**
 * @author benmakusha
 */
public class ComposeRanges {

    String[] composeRanges(int[] nums) {
        if (nums.length == 0) return new String[0];
        ArrayList<String> res = new ArrayList<>();
        int first = nums[0], last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] + 1){
                res.add(first == last ? Integer.toString(first) :
                        Integer.toString(first) + "->" + Integer.toString(last));
                first = nums[i];
            }
            last = nums[i];
        }
        res.add(first == last ? Integer.toString(first) : Integer.toString(first) + "->" + Integer.toString(last));
        String[] result = new String[res.size()];
        result = res.toArray(result);
        return result;
    }
}
