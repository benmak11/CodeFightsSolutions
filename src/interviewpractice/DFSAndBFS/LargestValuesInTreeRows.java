package interviewpractice.DFSAndBFS;

import interviewpractice.trees.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author benmakusha
 */
public class LargestValuesInTreeRows {

    int[] largestValuesInTreeRows(Tree<Integer> t) {
        if (t == null) return new int[0];
        List<Integer> list = new ArrayList<>();
        Queue<Tree<Integer>> queue = new LinkedList<>();
        queue.add(t);
        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Tree<Integer> temp = queue.remove();
                max = Math.max(max, temp.value);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            list.add(max);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);

        return result;
    }
}
