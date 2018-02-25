package interviewpractice.commonTechniquesBasic;

/**
 * @author benmakusha
 */
public class ArrayMaxConsecutiveSum2 {

    int arrayMaxConsecutiveSum2(int[] inputArray) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < inputArray.length; i++) {
            max_ending_here = max_ending_here + inputArray[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }

        return max_so_far;
    }

}
