package interviewpractice.arrays;

/**
 * @author benmakusha
 */

public class RotateImage {

    public int[][] rotateImage(int[][] a) {
        int n = a.length;
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                //save top
                int top = a[first][i];

                //left -> top
                a[first][i] = a[last - offset][first];
                //bottom -> left
                a[last - offset][first] = a[last][last - offset];

                //right -> bottom
                a[last][last-offset] = a[i][last];

                // top -> right
                a[i][last] = top;
            }
        }
        return a;
    }

}
