package interviewpractice.commonTechniquesBasic;

import java.util.HashMap;

/**
 * @author benmakusha
 */
public class SumOfTwo {

    boolean sumOfTwo(int[] a, int[] b, int v) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], 0);
        }

        for (int j = 0; j < b.length; j++) {
            if (map.containsKey(v - b[j])) {
                return true;
            }
        }

        return false;
    }

}
