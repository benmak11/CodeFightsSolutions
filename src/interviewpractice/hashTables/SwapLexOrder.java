package interviewpractice.hashTables;

import java.util.*;

/**
 * @author benmakusha
 */

public class SwapLexOrder {

    public String swapLexOrder(String str, int[][] pairs) {
        char[] charArray = str.toCharArray();
        List<Set<Integer>> pools = new ArrayList<>();
        for (int[] pair : pairs) {
            List<Set<Integer>> foundPools = new ArrayList<>();
            for (Set<Integer> pool : pools) {
                if (pool.contains(pair[0]) || pool.contains(pair[1]))
                    foundPools.add(pool);
            }
            if (foundPools.size() == 0) {
                Set<Integer> newPool = new TreeSet<>();
                newPool.add(pair[0]);
                newPool.add(pair[1]);
                pools.add(newPool);
            } else if (foundPools.size() == 1) {
                int i = 0;
                Set<Integer> pool = foundPools.get(0);
                if (pool.contains(pair[i]) || pool.contains(pair[++i]))
                    pool.add(pair[1 - i]);
            } else if (foundPools.size() == 2) {
                foundPools.get(0).addAll(foundPools.get(1));
                pools.remove(foundPools.get(1));
            } else
                throw new RuntimeException("Merge Error");
        }

        for (Set<Integer> pool : pools) {
            char[] possibles = new char[pool.size()];
            int i = 0;
            for (int pos : pool)
                possibles[i++] = charArray[pos - 1];
            Arrays.sort(possibles);
            for (int pos : pool)
                charArray[pos - 1] = possibles[--i];
        }

        return new String(charArray);
    }
}
