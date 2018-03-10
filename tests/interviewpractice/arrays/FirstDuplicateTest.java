package interviewpractice.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */

public class FirstDuplicateTest {

    private FirstDuplicate firstDuplicate = new FirstDuplicate();
    private int[] array = new int[] {2, 3, 3, 1, 5, 2};

    @Test
    public void testFirstDuplicateOne() {
        int result = firstDuplicate.firstDuplicate(array);
        assertEquals(3, result);
    }
}