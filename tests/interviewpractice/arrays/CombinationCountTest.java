package interviewpractice.arrays;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> row1 = new ArrayList<>();

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

//    @Test
//    public void testPairs() {
//        List<Integer> row1 = new ArrayList<>();
//        row1.add(1);
//        row1.add(1);
//        row1.add(0);
//        row1.add(0);
//        List<Integer> row2 = new ArrayList<>();
//        row2.add(0);
//        row2.add(0);
//        row2.add(0);
//        row2.add(0);
//        List<Integer> row3 = new ArrayList<>();
//        row3.add(0);
//        row3.add(0);
//        row3.add(1);
//        row3.add(1);
//        List<Integer> row4 = new ArrayList<>();
//        row4.add(0);
//        row4.add(0);
//        row4.add(0);
//        row4.add(0);
//        list.add(row1);
//        list.add(row2);
//        list.add(row3);
//        list.add(row4);
//        int result = combinationCount.numberAmazonTreasureTrucks(4, 4, list);
//        assertEquals(2, result);
//    }
}