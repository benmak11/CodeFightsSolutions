package interviewpractice.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author benmakusha
 */

public class Sudoku2 {

    public boolean sudoku2(char[][] grid) {
        for(int index = 0; index < 3; ++index) {
            for(int j = 0; j < 3; ++j) {
                Set<Character> ifItExists = new HashSet<Character>();
                for(int k = 0; k < 3; ++k) {
                    int row = index * 3 + k;
                    for(int k2 = 0; k2 < 3; ++k2) {
                        int column = j * 3 + k2;
                        char character = grid[row][column];
                        if(character != '.') {
                            if(ifItExists.contains(character)) {
                                return false;
                            }
                            ifItExists.add(character);
                        }
                    }
                }
            }
        }
        for(int index = 0; index < 9; ++index) {
            Set<Character> firstExistence = new HashSet<Character>();
            Set<Character> secondExistence = new HashSet<Character>();
            for(int j = 0; j < 9; ++j) {
                char character = grid[index][j];
                if(character != '.') {
                    if(firstExistence.contains(character)) {
                        return false;
                    }
                    firstExistence.add(character);
                }
                char secCharacter = grid[j][index];
                if(secCharacter != '.') {
                    if(secondExistence.contains(secCharacter)) {
                        return false;
                    }
                    secondExistence.add(secCharacter);
                }
            }
        }
        return true;
    }


}
