package interviewpractice.trees;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class FindSubStringTest {

    private FindSubString find = new FindSubString();

    private String[] words = {"Apple", "Melon", "Orange", "Watermelon"};
    private String[] parts = {"a", "mel", "lon", "el", "An"};
    private String[] testOneResult = {"Apple", "Me[lon]", "Or[a]nge", "Water[mel]on"};

    @Test
    public void testFindSubstrings() {
        String[] result = find.findSubstrings(words, parts);
        Assert.assertEquals(testOneResult, result);
    }
}