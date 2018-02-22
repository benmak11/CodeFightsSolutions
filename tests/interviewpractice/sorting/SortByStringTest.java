package interviewpractice.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class SortByStringTest {

    private SortByString sort = new SortByString();

    private String inputVersionOne = "weather";
    private String inputVersionTwo = "therapyw";

    private String inputVersionOne2 = "good";
    private String inputVersionTwo2 = "odg";

    private String inputVersionOne3 = "sheep";
    private String inputVersionTwo3 = "pseh";

    private String inputVersionOne4 = "";
    private String inputVersionTwo4 = "";

    private String inputVersionOne5 = "a";
    private String inputVersionTwo5 = "ab";

    private String inputVersionOne6 = "kusfiaaqjr";
    private String inputVersionTwo6 = "qsfiaurjk";

    private String inputVersionOne7 = "wcptedsgaisegdxpestczpxat";
    private String inputVersionTwo7 = "svldchawotingexpufzrk";

    private String inputVersionOne8 = "ababababababababababababababbabbabababbababba";
    private String inputVersionTwo8 = "ba";

    private String inputVersionOne9 = "ylcteylgkjbpvmdfqppxgenyqdcrghpeoaespzjsyyxiybgvxd";
    private String inputVersionTwo9 = "kzbmidqwroycevgjasthlnxfpu";

    @Test
    public void testSortByStringOne() {
        String result = sort.sortByString(inputVersionOne, inputVersionTwo);
        Assert.assertEquals("theeraw", result);
    }

    @Test
    public void testSortByStringTwo() {
        String result = sort.sortByString(inputVersionOne2, inputVersionTwo2);
        Assert.assertEquals("oodg", result);
    }

    @Test
    public void testSortByStringThree() {
        String result = sort.sortByString(inputVersionOne3, inputVersionTwo3);
        Assert.assertEquals("pseeh", result);
    }

    @Test
    public void testSortByStringFour() {
        String result = sort.sortByString(inputVersionOne4, inputVersionTwo4);
        Assert.assertEquals("", result);
    }

    @Test
    public void testSortByStringFive() {
        String result = sort.sortByString(inputVersionOne5, inputVersionTwo5);
        Assert.assertEquals("a", result);
    }

    @Test
    public void testSortByStringSix() {
        String result = sort.sortByString(inputVersionOne6, inputVersionTwo6);
        Assert.assertEquals("qsfiaaurjk", result);
    }

    @Test
    public void testSortByStringSeven() {
        String result = sort.sortByString(inputVersionOne7, inputVersionTwo7);
        Assert.assertEquals("sssddccaawtttiggeeexxpppz", result);
    }

    @Test
    public void testSortByStringEight() {
        String result = sort.sortByString(inputVersionOne8, inputVersionTwo8);
        Assert.assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaa", result);
    }

    @Test
    public void testSortByStringNine() {
        String result = sort.sortByString(inputVersionOne9, inputVersionTwo9);
        Assert.assertEquals("kzbbmidddqqroyyyyyycceeeevvggggjjassthllnxxxfppppp", result);
    }
}