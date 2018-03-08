package interviewpractice.heapsStacksQueues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class DecodeStringTest {

    private DecodeString decode = new DecodeString();

    private String inputString = "";
    private String resultStr = "";
    private String inputString2 = "";
    private String resultStr2 = "";
    private String inputString3 = "";
    private String resultStr3 = "";
    private String inputString4 = "";
    private String resultStr4 = "";
    private String inputString5 = "";
    private String resultStr5 = "";


    @Test
    public void testDecodeStringOne() {
        String result = decode.decodeString(inputString);
        assertEquals(resultStr, result);
    }

    @Test
    public void testDecodeStringTwo() {
        String result = decode.decodeString(inputString2);
        assertEquals(resultStr2, result);
    }

    @Test
    public void testDecodeStringThree() {
        String result = decode.decodeString(inputString3);
        assertEquals(resultStr3, result);
    }

    @Test
    public void testDecodeStringFour() {
        String result = decode.decodeString(inputString4);
        assertEquals(resultStr4, result);
    }

    @Test
    public void testDecodeStringFive() {
        String result = decode.decodeString(inputString5);
        assertEquals(resultStr5, result);
    }
}