package interviewpractice.trees;

/**
 * @author benmakusha
 */
public class DeleteFromBST {

    Tree<Integer> deleteFromBST(Tree<Integer> t, int[] queries) {
        if (queries == null || queries.length == 0) return t;
        Tree<Integer> root = t;
        int q_len = queries.length;
        for (int i = 0; i < q_len; i++) {
            int ele = queries[i];
            if (root == null) return null;
            root = delete(root, null, false, ele);
        }
        return root;
    }
    
    private Tree<Integer> delete(Tree<Integer> root, Tree<Integer> parent, boolean isLeft, int ele) {
        Tree<Integer> curr = root;
        while (true) {
            if (curr.value == ele) {
                if (curr.left == null) {
                    if (parent == null) {
                        root = curr.right;
                    } else {
                        if (isLeft) {
                            parent.left = curr.right;
                        } else {
                            parent.right = curr.right;
                        }
                    }
                    curr.right = null;
                } else {
                    Tree<Integer> temp = curr.left;
                    Tree<Integer> prev = curr;
                    while (temp.right != null) {
                        prev = temp;
                        temp = temp.right;
                    }
                    curr.value = temp.value;
                    if (prev == curr) {
                        curr.left = temp.left;
                    } else {
                        prev.right = temp.left;
                    }
                }
                break;
            } else if (curr.value < ele) {
                parent = curr;
                curr = curr.right;
                isLeft = false;
            } else {
                parent = curr;
                curr = curr.left;
                isLeft = true;
            }
            if (curr == null) break;
        }
        return root;
    }
}
