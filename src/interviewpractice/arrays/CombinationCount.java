package interviewpractice.arrays;

import java.util.Arrays;

/**
 * @author benmakusha
 */
public class CombinationCount {

    int combinationCount(int[] array1, int[] array2, int[] array3) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        Arrays.sort(array3);

        int ia = 0;
        int ic = 0;
        int result = 0;
        for (int ib = 0; ib < array2.length; ib++) {
            while (array1[ia] < array2[ib] && ia < array1.length - 1) {
                ia++;
            }
            while (array3[ic] <= array2[ib] && ic < array3.length - 1) {
                ic++;
            }
            result += ia * (array2.length - ic);
        }
        return result;
    }

//    int numberAmazonTreasureTrucks(int rows, int column,
//                                   List<List<Integer> > grid)
//    {
//
//        int result = 0;
//        for (int i = 0; i < rows; i++) {
//            for(int j = 0; j < column; j++) {
//                if (grid.get(i).get(j) == 1) {
//                    result++;
//                    findNeighbors(grid, i, j, column);
//                }
//            }
//        }
//
//        return result;
//    }
//
//    void findNeighbors(List<List<Integer>> grid,
//                       int i, int j, int column)
//    {
//
//
//        if (j < 0 || j >= column || grid.get(i).get(j) != 1) {
//            return;
//        }
//        findNeighbors(grid, i, j-1, column);
//        findNeighbors(grid, i, j+1, column);
//    }
//
//    void testMethod() {
//        Pair<Integer, Integer> newPair = new Pair<>(1, 2);
//    }

}
