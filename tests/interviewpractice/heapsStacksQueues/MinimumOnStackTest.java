package interviewpractice.heapsStacksQueues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class MinimumOnStackTest {

    private MinimumOnStack min = new MinimumOnStack();

    private String[] operations = new String[] {"push 10", "min", "push 5", "min", "push 8", "min", "pop",
            "min", "pop", "min"};
    private int[] resultArray = new int[] {10, 5, 5, 5, 10};

    private String[] operations2 = new String[] {"push 10", "min", "pop", "push 3", "min", "push 5", "pop",
            "push 3", "min", "pop"};
    private int[] resultArray2 = new int[] {10, 3, 3};

    private String[] operations3 = new String[] {"push 10"};
    private int[] resultArray3 = new int[] {};

    private String[] operations4 = new String[] {"push 10", "pop"};
    private int[] resultArray4 = new int[] {};


    @Test
    public void testMinimumOnStackOne() {
        int[] result = min.minimumOnStack(operations);
        for (int i = 0; i < result.length; i++) {
            assertEquals(resultArray[i], result[i]);
        }
    }

    @Test
    public void testMinimumOnStackTwo() {
        int[] result = min.minimumOnStack(operations2);
        for (int i = 0; i < result.length; i++) {
            assertEquals(resultArray2[i], result[i]);
        }
    }

    @Test
    public void testMinimumOnStackThree() {
        int[] result = min.minimumOnStack(operations3);
        for (int i = 0; i < result.length; i++) {
            assertEquals(resultArray3[i], result[i]);
        }
    }
    @Test
    public void testMinimumOnStackFour() {
        int[] result = min.minimumOnStack(operations4);
        for (int i = 0; i < result.length; i++) {
            assertEquals(resultArray4[i], result[i]);
        }
    }
}