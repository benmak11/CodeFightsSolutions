package arcadeUniverse.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class _11IsLuckyTest {

    private _11IsLucky isLucky = new _11IsLucky();
    private int value = 1230;

    @Test
    public void isLucky() {
        boolean result = isLucky.isLucky(value);
        assertTrue(result);
    }
}