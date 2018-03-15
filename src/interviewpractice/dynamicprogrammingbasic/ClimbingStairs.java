package interviewpractice.dynamicprogrammingbasic;

/**
 * @author benmakusha
 */
public class ClimbingStairs {

    int climbingStairs(int n) {
        if (n <= 2) return n;

        int[] numbers = new int[n];
        numbers[0] = 1;
        numbers[1] = 2;
        for (int i = 2; i < n; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[n-1];
    }
}
