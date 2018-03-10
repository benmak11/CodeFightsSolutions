package interviewpractice.heapsStacksQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author benmakusha
 */
public class MinimumOnStack {

    int[] minimumOnStack(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minimum_count = new Stack<>();
        Stack<Integer> minimum_value = new Stack<>();
        List<Integer> tempList = new ArrayList<>();

        for (String op : operations) {
            String[] tempOp = op.split(" ");

            if (tempOp[0].equals("min")) {
                tempList.add(minimum_value.peek());
                continue;
            }

            if (tempOp[0].equals("push")) {
                int value = Integer.parseInt(tempOp[1]);
                stack.push(value);
                if (minimum_value.isEmpty()) {
                    minimum_count.push(1);
                    minimum_value.push(value);
                }
                if (value < minimum_value.peek()) {
                    minimum_count.add(1);
                    minimum_value.push(value);
                } else if (value == minimum_value.peek()) {
                    int tempo = minimum_count.peek();
                    minimum_count.set(minimum_count.size() - 1, tempo++);
                }
                continue;
            }

            if (tempOp[0].equals("pop")) {
                int value = stack.pop();
                if (value == minimum_value.peek()) {
                    int currentValue = minimum_count.peek();
                    minimum_count.set(minimum_count.size() - 1, currentValue--);

                    if (!minimum_count.isEmpty()) {
                        minimum_value.pop();
                        minimum_count.pop();
                    }
                }
                continue;
            }
        }

        return toArray(tempList);
    }

    int[] toArray(List<Integer> a) {
        int[] result = new int[a.size()];
        int index = 0;
        for (Integer i : a) {
            result[index] = i;
            index++;
        }
        return result;
    }
}
