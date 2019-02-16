package arcadeUniverse.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class _12ReverseInParenthesesTest {

    private _12ReverseInParentheses reverse = new _12ReverseInParentheses();
    private String inputString = "foo(bar)baz";
    private String inputStringOutput = "foorabbaz";

    @Test
    public void reverseInParentheses() {
        String result = reverse.reverseInParentheses(inputString);
        assertEquals(inputStringOutput, result);
    }
}