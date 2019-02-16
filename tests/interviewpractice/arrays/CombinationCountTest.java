package interviewpractice.arrays;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class CombinationCountTest {

    private CombinationCount combinationCount = new CombinationCount();

    private int[] firstArray = {12, 6, 8, 3};
    private int[] secArray = {1, 3, 5, 8};
    private int[] thirdArray = {9, 15, 7, 5};

    private int[] firstArray1 = {25, 25};
    private int[] secArray1 = {30, 30};
    private int[] thirdArray1 = {35, 37};

    @Test
    public void testCombinationCountOne() {
        int result = combinationCount.combinationCount(firstArray, secArray, thirdArray);
        assertEquals(7, result);
    }

    @Ignore
    @Test
    public void testCombinationCountTwo() {
        int result = combinationCount.combinationCount(firstArray1, secArray1, thirdArray1);
        assertEquals(8, result);
    }
}