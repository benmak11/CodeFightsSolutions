package interviewpractice.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */

public class Sudoku2Test {

    private Sudoku2 sudoku = new Sudoku2();

    private char[][] sudokuGrid = new char[][] {
            {'.', '.', '.', '1', '4', '.', '.', '2', '.'},
            {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
            {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
            {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
            {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
            {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
            {'.', '.', '.', '5', '.', '.', '.', '7', '.'}
    };

    private char[][] sudokuGrid2 = new char[][]{
            {'.', '.', '.', '.', '2', '.', '.', '9', '.'},
            {'.', '.', '.', '.', '6', '.', '.', '.', '.'},
            {'7', '1', '.', '.', '7', '5', '.', '.', '.'},
            {'.', '7', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '8', '3', '.', '.', '.'},
            {'.', '.', '8', '.', '.', '7', '.', '6', '.'},
            {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
            {'.', '1', '.', '2', '.', '.', '.', '.', '.'},
            {'.', '2', '.', '.', '3', '.', '.', '.', '.'}
    };

    @Test
    public void testSudoku2One() {
        boolean result = sudoku.sudoku2(sudokuGrid);
        assertTrue(result);
    }

    @Test
    public void testSudoku2Two() {
        boolean result = sudoku.sudoku2(sudokuGrid2);
        assertFalse(result);
    }
}