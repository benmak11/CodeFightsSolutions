package outco.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class FindPathTest {

    private FindPath findPath = new FindPath();

    @Test
    public void findPath() {
        int result = findPath.findPath(3, 3);
        assertEquals(6, result);
    }

    @Test
    public void findPathSimple() {
        int result = findPath.findPathSimple(3, 3);
        assertEquals(6, result);
    }
}