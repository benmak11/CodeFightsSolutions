package interviewpractice.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */

public class RotateImageTest {

    private RotateImage rotate = new RotateImage();

    private int[][] testImage = new int[][]{
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
    };
    private int[][] resultImage = new int[][]{
            {7, 4, 1}, {8, 5, 2}, {9, 6, 3}
    };

    @Test
    public void testRotateImageOne() {
        int[][] result = rotate.rotateImage(testImage);
        assertArrayEquals(resultImage, result);
    }
}