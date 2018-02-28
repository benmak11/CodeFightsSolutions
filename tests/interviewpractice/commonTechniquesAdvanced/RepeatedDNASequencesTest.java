package interviewpractice.commonTechniquesAdvanced;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class RepeatedDNASequencesTest {

    private RepeatedDNASequences repeated = new RepeatedDNASequences();

    private String inputDNAOne = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    private String[] expectedOutput1 = new String[] {"AAAAACCCCC", "CCCCCAAAAA"};
    private String inputDNATwo = "";
    private String inputDNAThree = "A";
    private String inputDNAFour = "";
    private String inputDNAFive = "GAGAGAGAGAGAG";
    private String[] expectedOutput2 = new String[] {"AGAGAGAGAG", "GAGAGAGAGA"};
    private String inputDNASix = "AAAAAGGGGGAAAAAGGGGGGAAAAACCCCTTT";
    private String[] expectedOutput3 = new String[] {"AAAAAGGGGG", "GGGGGAAAAA"};
    private String inputDNASeveb = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
            "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
            "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
            "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
            "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
            "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    private String[] expectedOutput4 = new String[] {"AAAAAAAAAA"};

    @Test
    public void testRepeatedDNASequencesOne() {
        String[] result = repeated.repeatedDNASequences(inputDNAOne);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expectedOutput1[i], result[i]);
        }
    }

    @Test
    public void testRepeatedDNASequencesTwo() {
        String[] result = repeated.repeatedDNASequences(inputDNATwo);
        assertEquals(new String[]{}, result);
    }

    @Test
    public void testRepeatedDNASequencesThree() {
        String[] result = repeated.repeatedDNASequences(inputDNAThree);
        assertEquals(new String[]{}, result);
    }

    @Test
    public void testRepeatedDNASequencesFour() {
        String[] result = repeated.repeatedDNASequences(inputDNAFour);
        assertEquals(new String[]{}, result);
    }

    @Test
    public void testRepeatedDNASequencesFive() {
        String[] result = repeated.repeatedDNASequences(inputDNAFive);
        for (int i = 0; i < result.length; i++) {
            Assert.assertEquals(expectedOutput2[i], result[i]);
        }
    }

    @Test
    public void testRepeatedDNASequencesSix() {
        String[] result = repeated.repeatedDNASequences(inputDNASix);
        for (int i = 0; i < result.length; i++) {
            Assert.assertEquals(expectedOutput3[i], result[i]);
        }
    }

    @Test
    public void testRepeatedDNASequencesSeven() {
        String[] result = repeated.repeatedDNASequences(inputDNASeveb);
        for (int i = 0; i < result.length; i++) {
            Assert.assertEquals(expectedOutput4[i], result[i]);
        }
    }
}