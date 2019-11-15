package interviewpractice.trees;

import java.util.Stack;

/**
 * @author benmakusha
 */

public class RestoreBinaryTree {

    // Better iterative solution
    Tree<Integer> restoreBinaryTree(int[] inorder, int[] preorder) {
        int j = 0;
        Stack<Tree<Integer>> stack = new Stack<>();
        Tree<Integer> root = new Tree<>(preorder[0]);
        stack.push(root);
        Tree<Integer> node = root;
        for (int index = 1; index < preorder.length; index++) {
            boolean popped= false;
            while (!stack.isEmpty() && stack.peek().value.equals(inorder[j])) {
                j++;
                node = stack.pop();
                popped = true;
            }
            if( popped){
                Tree<Integer> next = new Tree<>(preorder[index]);
                node.right = next;
                stack.push(next);
                continue;
            }
            Tree<Integer> next = new Tree<>(preorder[index]);
            stack.peek().left = next;
            stack.push(next);
        }
        return root;
    }

}
