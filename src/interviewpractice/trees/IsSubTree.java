package interviewpractice.trees;

/**
 * @author benmakusha
 */

public class IsSubTree {

    public boolean isSubtree(Tree<Integer> t1, Tree<Integer> t2) {
        if (t2 == null)
            return true;

        return isASubtree(t1, t2);
    }

    public boolean isASubtree(Tree<Integer> t1, Tree<Integer> t2) {
        if (t1 != null && t2 == null)
            return false;
        if (t2 != null && t1 == null)
            return false;
        if (t1 == null && t2 == null)
            return true;
        if ( (t1.value).equals(t2.value))
            return isASubtree(t1.left, t2.left) && isASubtree(t1.right, t2.right);
        else
            return isASubtree(t1.left, t2) || isASubtree(t1.right, t2);
    }
}
