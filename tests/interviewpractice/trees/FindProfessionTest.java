package interviewpractice.trees;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */

public class FindProfessionTest {

    private FindProfession fp = new FindProfession();

    @Test
    public void testFindProfessionOne() {
        String result = fp.findProfession(3, 3 );
        Assert.assertEquals("D", result);
    }
}