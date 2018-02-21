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

//    public Tree<Integer> restoreBinaryTree(int[] inorder, int[] preorder) {
//        return helper(0, 0, inorder.length - 1, preorder, inorder);
//    }
//
//    public Tree<Integer> helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
//        if (preStart > preorder.length - 1 || inStart > inEnd) {
//            return null;
//        }
//        Tree<Integer> root = new Tree<>(preorder[preStart]);
//        int inIndex = 0; // Index of current root in inorder
//        for (int i = inStart; i <= inEnd; i++) {
//            if (inorder[i] == root.value.intValue()) {
//                inIndex = i;
//            }
//        }
//        root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
//        root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder,
//                inorder);
//        return root;
//    }
}
