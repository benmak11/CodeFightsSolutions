package interviewpractice.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author benmakusha
 */

public class KthSmallestInBST {

    public int kthSmallestInBST(Tree<Integer> t, int k) {
        List<Integer> treeValues = new ArrayList<>();
        treeValues = traverseTree(treeValues, t);
        Collections.sort(treeValues);
        return treeValues.get(k - 1);
    }

    public List<Integer> traverseTree(List<Integer> passed, Tree<Integer> t) {
        if (t != null) {
            passed.add(t.value);
            traverseTree(passed, t.left);
            traverseTree(passed, t.right);
        }
        return passed;
    }
}
