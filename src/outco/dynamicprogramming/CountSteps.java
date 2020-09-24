package outco.dynamicprogramming;

/**
 * @author benmakusha
 */
public class CountSteps {

    public int countStepsRecursive(int n) {
        return traverse(n);
    }

    private int traverse(int current) {
        if (current <= 1) return 0;
        // subtract by 1
        int steps = traverse(current - 1);
        // divide by 3
        if (current % 3 == 0) {
            int divide3 = traverse(current / 3);
            steps = Math.min(steps, divide3);
        }
        //divide2
        if (current % 2 == 0) {
            int divide2 = traverse(current / 2);
            steps = Math.min(steps, divide2);
        }
        return steps + 1;
    }

    public int countSteps_greedyApproach(int n) {
        int sum = 0;
        if (n <= 1) return 0;
        while (n != 1) {
            if (n % 3 == 0) {
                sum++;
                n = n / 3;
                continue;
            }
            if (n % 2 == 0) {
                sum++;
                n = n / 2;
                continue;
            }

            n = n - 1;
            sum++;
        }
        return sum;
    }
}
