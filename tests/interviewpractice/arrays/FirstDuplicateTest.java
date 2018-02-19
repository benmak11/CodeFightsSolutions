package interviewpractice.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */

public class FirstDuplicateTest {

    private FirstDuplicate firstDuplicate;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        firstDuplicate = new FirstDuplicate();
        array = new int[] {2, 3, 3, 1, 5, 2};
    }

    @Test
    public void firstDuplicate() {
        int result = firstDuplicate.firstDuplicate(array);
        Assert.assertEquals(3, result);
    }
}