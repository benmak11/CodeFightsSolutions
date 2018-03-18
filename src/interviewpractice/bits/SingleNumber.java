package interviewpractice.bits;

/**
 * @author benmakusha
 */
public class SingleNumber {

    int singleNumber(int[] nums) {
        int res = 0;
        for (int num = 0; num < nums.length; num++) {
            res ^= nums[num];
        }
        return res;
    }
}
