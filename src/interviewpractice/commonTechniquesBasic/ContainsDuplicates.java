package interviewpractice.commonTechniquesBasic;

import java.util.HashSet;
import java.util.Set;

/**
 * @author benmakusha
 */
public class ContainsDuplicates {

    boolean containsDuplicates(int[] a) {
        int count = 0;
        Set<Integer> values = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (values.contains(a[i])) {
                count++;
            } else {
                values.add(a[i]);
            }
        }

        return count > 0;
    }

}
