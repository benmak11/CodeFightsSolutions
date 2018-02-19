package interviewpractice.trees;

/**
 * @author benmakusha
 */

public class HasPathWithGivenSum {

    boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
        return hasPathWithGivenSum(t, s, 0);
    }

    boolean hasPathWithGivenSum(Tree<Integer> z, int s, int summation) {
        if (z == null)
            return s == summation;
        if (isLeave(z))
            return s == summation + z.value;
        if (z.left != null && hasPathWithGivenSum(z.left, s, summation + z.value))
            return true;
        if (z.right != null && hasPathWithGivenSum(z.right, s, summation + z.value))
            return true;

        return false;
    }

    boolean isLeave(Tree<Integer> x) {
        return x.left == null && x.right == null;
    }

    boolean hasSomePathWithGivenSum(Tree<Integer> root, int s) {
        if (root == null && s == 0) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (root.value == s && root.left == null && root.right == null)
            return true;

        return hasSomePathWithGivenSum(root.left, s - root.value) ||
                hasSomePathWithGivenSum(root.right, s - root.value);
    }
}
