package interviewpractice.heapsStacksQueues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class NextLargerTest {

    private NextLarger next = new NextLarger();

    private int[] inputArray = new int[] {6, 7, 3, 8};
    private int[] resultArray = new int[] {7, 8, 8, -1};

    private int[] inputArray2 = new int[] {4, 2};
    private int[] resultArray2 = new int[] {-1, -1};

    private int[] inputArray3 = new int[] {1, 3, 2, 4};
    private int[] resultArray3 = new int[] {3, 4, 4, -1};

    private int[] inputArray4 = new int[] {6, 2, 7, 3, 1, 0, 4, 5};
    private int[] resultArray4 = new int[] {7, 7, -1, 4, 4, 4, 5, -1};

    private int[] inputArray5 = new int[] {10, 3, 12, 4, 2, 9, 13, 0, 8, 11, 1, 7, 5, 6};
    private int[] resultArray5 = new int[] {12, 12, 13, 9, 9, 13, -1, 8, 11, -1, 7, -1, 6, -1};

    @Test
    public void testNextLargerOne() {
        int[] result = next.nextLarger(inputArray);
        for (int i = 0; i < result.length; i++) {
            assertEquals(resultArray[i], result[i]);
        }
    }

    @Test
    public void testNextLargerTwo() {
        int[] result = next.nextLarger(inputArray2);
        for (int i = 0; i < result.length; i++) {
            assertEquals(resultArray2[i], result[i]);
        }
    }

    @Test
    public void testNextLargerThree() {
        int[] result = next.nextLarger(inputArray3);
        for (int i = 0; i < result.length; i++) {
            assertEquals(resultArray3[i], result[i]);
        }
    }

    @Test
    public void testNextLargerFour() {
        int[] result = next.nextLarger(inputArray4);
        for (int i = 0; i < result.length; i++) {
            assertEquals(resultArray4[i], result[i]);
        }
    }

    @Test
    public void testNextLargerFive() {
        int[] result = next.nextLarger(inputArray5);
        for (int i = 0; i < result.length; i++) {
            assertEquals(resultArray5[i], result[i]);
        }
    }
}