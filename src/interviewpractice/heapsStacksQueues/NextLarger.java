package interviewpractice.heapsStacksQueues;

import java.util.Stack;

/**
 * @author benmakusha
 */
public class NextLarger {

    int[] nextLarger(int[] a) {
        if (a.length == 0)
            return new int[0];
        int[] result = new int[a.length];
        Stack<Integer> rightSide = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--)
            rightSide.push(a[i]);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < rightSide.peek())
                result[i] = rightSide.pop();
            else {
                while (rightSide.size() != 0 &&
                        rightSide.peek() <= a[i]){
                    stack.push(rightSide.pop());
                }
                if (rightSide.size() == 0)
                    result[i] = -1;
                else
                    result[i] = rightSide.peek();
                while (stack.size() != 0) {
                    rightSide.push(stack.pop());
                }
                rightSide.pop();
            }
        }
        result[a.length - 1] = -1;
        return result;
    }

}
