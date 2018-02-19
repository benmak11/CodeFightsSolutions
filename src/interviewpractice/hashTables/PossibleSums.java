package interviewpractice.hashTables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author benmakusha
 */

public class PossibleSums {

    public int possibleSums(int[] coins, int[] quantity) {
        Set<Integer> possibleSums = new HashSet<>();
        possibleSums.add(0);
        for (int index = 0; index < quantity.length; index++) {
            ArrayList<Integer> currentSums = new ArrayList<>(possibleSums);
            for (Integer current : currentSums) {
                for (int j = 1; j <= quantity[index]; j++) {
                    possibleSums.add(current + j * coins[index]);
                }
            }
        }
        return possibleSums.size() - 1;
    }
}
