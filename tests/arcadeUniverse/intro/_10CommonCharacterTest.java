package arcadeUniverse.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class _10CommonCharacterTest {

    private _10CommonCharacter controller = new _10CommonCharacter();
    String s1 = "aabcc";
    String s2 = "adcaa";

    @Test
    public void testCommonCharacterCount() {
        int result = controller.commonCharacterCount(s1, s2);
        assertEquals(3, result);
    }
}