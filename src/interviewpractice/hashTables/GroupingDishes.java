package interviewpractice.hashTables;

import java.util.*;

/**
 * @author benmakusha
 */

public class GroupingDishes {

    public String[][] groupingDishes(String[][] dishes) {
        Map<String, Set<String>> group = new HashMap<>();
        for (int index = 0; index < dishes.length; ++index) {
            String[] dish = dishes[index];
            String dishName = dish[0];
            for (int j = 1; j < dish.length; ++j) {
                String ingredient = dish[j];
                if (group.containsKey(ingredient)) {
                    group.get(ingredient).add(dishName);
                } else {
                    Set<String> set = new HashSet<>();
                    set.add(dishName);
                    group.put(ingredient, set);
                }
            }
        }

        String[] ingredients = new String[group.size()];
        int index = 0;
        for (String ingredient : group.keySet()) {
            ingredients[index++] = ingredient;
        }
        Arrays.sort(ingredients);
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < group.size(); ++i) {
            String ingredient = ingredients[i];
            Set<String> dishSet = group.get(ingredient);
            if (dishSet.size() < 2) {
                continue;
            }
            index = 0;
            String[] dishList = new String[dishSet.size() + 1];
            for (String dishName : dishSet) {
                dishList[index++] = dishName;
            }
            dishList[index] = "";
            Arrays.sort(dishList);
            dishList[0] = ingredient;
            list.add(dishList);
        }

        String[][] result = new String[list.size()][];
        for(int i = 0; i < list.size(); ++i) {
            result[i] = list.get(i);
        }

        return result;
    }

}
