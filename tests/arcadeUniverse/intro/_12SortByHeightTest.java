package arcadeUniverse.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class _12SortByHeightTest {

    private _12SortByHeight sortByHeight = new _12SortByHeight();
    private int[] testArray = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
    private int[] testArrayOutput = new int[] {-1, 150, 160, 170, -1, -1, 180, 190};

    @Test
    public void sortByHeight() {
        int[] result = sortByHeight.sortByHeight(testArray);
        for (int i = 0; i < result.length; i++) {
            assertEquals(testArrayOutput[i], result[i]);
        }
    }
}