package arcadeUniverse.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class _21IPv4AddressTest {

    _21IPv4Address iPv4Address = new _21IPv4Address();

    String testInput = "64.233.161.00";
    String testInput2 = "01.233.161.131";

    @Test
    public void testIPv4Address() {
        boolean result = iPv4Address.isIPv4Address(testInput);
        assertFalse(result);
    }

    @Test
    public void testIPv4Address2() {
        boolean result = iPv4Address.isIPv4Address(testInput2);
        assertFalse(result);
    }
}