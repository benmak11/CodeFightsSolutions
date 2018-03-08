package interviewpractice.heapsStacksQueues;

import java.util.Arrays;

/**
 * @author benmakusha
 */
public class KthLargestElement {

    int kthLargestElement(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
