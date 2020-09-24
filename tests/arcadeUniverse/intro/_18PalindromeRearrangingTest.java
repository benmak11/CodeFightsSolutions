package arcadeUniverse.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class _18PalindromeRearrangingTest {

    _18PalindromeRearranging palindromeRearranging = new _18PalindromeRearranging();

    String testInput1 = "aabb";
    String testInput2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";

    @Test
    public void testPalindromeRearranging() {
        boolean result = palindromeRearranging.palindromeRearranging(testInput1);
        assertTrue(result);
    }

    @Test
    public void testPalindromeRearranging2() {
        boolean result = palindromeRearranging.palindromeRearranging(testInput2);
        assertFalse(result);
    }
}