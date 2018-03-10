package interviewpractice.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */

public class FirstNotRepeatingCharacterTest {

    private FirstNotRepeatingCharacter frt = new FirstNotRepeatingCharacter();

    private String testStr = "abacabad";

    @Test
    public void testFirstNotRepeatingCharacterOne() {
        char result = frt.firstNotRepeatingCharacter(testStr);
        assertEquals('c', result);
    }
}