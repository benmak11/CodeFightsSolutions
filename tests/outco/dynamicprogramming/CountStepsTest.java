package outco.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class CountStepsTest {

    private CountSteps count = new CountSteps();

    @Test
    public void countSteps() {
        int result = count.countSteps_greedyApproach(10);
        assertNotEquals(3, result);
    }

    @Test
    public void countSteps_secondTest() {
        int result = count.countSteps_greedyApproach(6);
        assertEquals(2, result);
    }

    @Test
    public void countStepsRecursive() {
        int result = count.countStepsRecursive(10);
        assertEquals(3, result);
    }

    @Test
    public void countStepsRecursive_secondTest() {
        int result = count.countStepsRecursive(5);
        assertEquals(3, result);
    }
}