package interviewpractice.dynamicprogrammingbasic;

/**
 * @author benmakusha
 */
public class HouseRobber {

    int houseRobber(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] maximum = new int[nums.length];
        maximum[0] = nums[0];
        maximum[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int curr = maximum[i-2];
            maximum[i] = Math.max(curr + nums[i], maximum[i-1]);
        }
        return maximum[nums.length - 1];
    }

}
