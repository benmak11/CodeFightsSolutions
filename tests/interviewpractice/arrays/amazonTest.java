package interviewpractice.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class amazonTest {

    private amazon az = new amazon();

    String a1 = "mi2 jog mid pet";
    String a2 = "wz3 34 54 398";
    String a3 = "a1 alps cow bar";
    String a4 = "x4 45 21 7";


    @Test
    public void reorderLines() {
        List<String> result = new ArrayList<>();
        result.add(a3);
        result.add(a1);
        result.add(a2);
        result.add(a4);

        List<String> secRes = az.reorderLines(4, result);
        assertEquals(result, secRes);
    }
}