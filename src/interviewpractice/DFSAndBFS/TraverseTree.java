package interviewpractice.DFSAndBFS;

import interviewpractice.trees.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author benmakusha
 */
public class TraverseTree {

    // Definition for binary tree:
    // class Tree<T> {
    //   Tree(T x) {
    //     value = x;
    //   }
    //   T value;
    //   Tree<T> left;
    //   Tree<T> right;
    //

    /**
     * Currently utilizing Tree class from trees package
     */
    int[] traverseTree(Tree<Integer> t) {
        if (t==null)
            return new int[0];
        List<Integer> list = new ArrayList<>();
        Queue<Tree<Integer>> q = new LinkedList<>();
        q.add(t);
        while(!q.isEmpty()){
            Tree<Integer> curr = q.remove();
            list.add(curr.value);
            if(curr.left != null)
                q.add(curr.left);
            if( curr.right != null)
                q.add(curr.right);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
