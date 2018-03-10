package interviewpractice.heapsStacksQueues;

/**
 * @author benmakusha
 */
public class NearestGreater {

    int[] nearestGreater(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < result.length; i++)
            result[i] = -1;
        int max = findMax(a);
        int pointer = 0;
        for (int index = 0; index < a.length; index++) {
            int curr = 0;
            if ( pointer != 0 && pointer == a[index]){
                curr = Math.max(1, curr - 2);
            } else {
                curr = 1;
            }
            if (a[index] == max) continue;
            else {
                while (true) {
                    if (index - curr >= 0 && a[index-curr] > a[index]){
                        result[index] = index - curr;
                        break;
                    }
                    if (index + curr < a.length && a[index+curr] > a[index]) {
                        result[index] = index + curr;
                        break;
                    }
                    if (index - curr < 0 && index + curr >= a.length) {
                        break;
                    }
                    curr += 1;
                }
            }
            pointer = a[index];
        }
        return result;
    }

    int findMax(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > result)
                result = a[i];
        }
        return result;
    }


//    TODO: First solution that didn't work
//    int[] nearestGreater(int[] a) {
//        int[] b = new int[a.length];
//        for (int i = 0; i < b.length; i++)
//            b[i] = -1;
//        Stack<Integer> stack = new Stack<>();
//        for (int k = 0; k < a.length; k++) {
//            while (!stack.isEmpty() && a[stack.peek()] < a[k]) {
//                int index = stack.pop();
//                if (b[index] == -1 || k - index < index - b[index])
//                    b[index] = k;
//            }
//            if (stack.isEmpty()){
//                b[k] = -1;
//            } else {
//                if (a[k] != a[stack.peek()]){
//                    b[k] = stack.peek();
//                } else {
//                    b[stack.peek()] = stack.peek();
//                }
//            }
//            stack.push(k);
//        }
//        return b;
//    }

}
