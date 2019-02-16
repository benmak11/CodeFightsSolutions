 package interviewpractice.trees;

/**
 * @author benmakusha
 */

public class IsTreeSymmetric {

    public boolean isTreeSymmetric(Tree<Integer> t) {
        return isItAMirror(t, t);
    }

    public boolean isItAMirror(Tree t1, Tree t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        return (t1.value).equals(t2.value)
                && isItAMirror(t1.left, t2.right)
                && isItAMirror(t1.right, t2.left);
    }
}
