package interviewpractice.commonTechniquesBasic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class SumOfTwoTest {

    private SumOfTwo sum = new SumOfTwo();

    private int[] firstInputArray = new int[] {1, 2, 3};
    private int[] secInputArray = new int[] {10, 20, 30, 40};
    private int v1 = 42;
    private int[] firstInputArray2 = new int[] {1, 2, 3};
    private int[] secInputArray2 = new int[] {10, 20, 30, 40};
    private int v2 = 50;
    private int[] firstInputArray3 = new int[] {};
    private int[] secInputArray3 = new int[] {1, 2, 3, 4};
    private int v3 = 4;


    @Test
    public void testSumOfTwoOne() {
        boolean result = sum.sumOfTwo(firstInputArray, secInputArray, v1);
        Assert.assertTrue(result);
    }

    @Test
    public void testSumOfTwoTwo() {
        boolean result = sum.sumOfTwo(firstInputArray2, secInputArray2, v2);
        Assert.assertFalse(result);
    }

    @Test
    public void testSumOfTwoThree() {
        boolean result = sum.sumOfTwo(firstInputArray3, secInputArray3, v3);
        Assert.assertFalse(result);
    }
}