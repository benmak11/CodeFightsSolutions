package interviewpractice.heapsStacksQueues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class NearestGreaterTest {

    private NearestGreater nearest = new NearestGreater();

    private int[] inputArray = new int[] {1, 4, 2, 1, 7, 6};
    private int[] resultArray = new int[] {1, 4, 1, 2, -1, 4};

    private int[] inputArray2 = new int[] {2, 1, 2, 1, 2};
    private int[] resultArray2 = new int[] {-1, 0, -1, 2, -1};

    private int[] inputArray3 = new int[] {7, 7, 7};
    private int[] resultArray3 = new int[] {-1, -1, -1};

    private int[] inputArray4 = new int[] {66, 33, 18, 80, 95, 65, 69, 46, 10, 3};
    private int[] resultArray4 = new int[] {3, 0, 1, 4, -1, 4, 4, 6, 7, 8};

    @Test
    public void testNearestGreaterOne() {
        int[] result = nearest.nearestGreater(inputArray);
        int j = 0;
        for (Integer i : result) {
            assertEquals(resultArray[j], i.intValue());
            j++;
        }
    }

    @Test
    public void testNearestGreaterTwo() {
        int[] result = nearest.nearestGreater(inputArray2);
        int j = 0;
        for (Integer i : result) {
            assertEquals(resultArray2[j], i.intValue());
            j++;
        }
    }

    @Test
    public void testNearestGreaterThree() {
        int[] result = nearest.nearestGreater(inputArray3);
        int j = 0;
        for (Integer i : result) {
            assertEquals(resultArray3[j], i.intValue());
            j++;
        }
    }

    @Test
    public void testNearestGreaterFour() {
        int[] result = nearest.nearestGreater(inputArray4);
        int j = 0;
        for (Integer i : result) {
            assertEquals(resultArray4[j], i.intValue());
            j++;
        }
    }
}