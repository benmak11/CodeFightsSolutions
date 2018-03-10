package interviewpractice.hashTables;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class GroupingDishesTest {

    private GroupingDishes gr = new GroupingDishes();

    private String[][] testDishes = new String[][] {
            {"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
            {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
            {"Quesadilla", "Chicken", "Cheese", "Sauce"},
            {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}
    };
    private String[][] testResultDishes = new String[][] {
            {"Cheese", "Quesadilla", "Sandwich"},
            {"Salad", "Salad", "Sandwich"},
            {"Sauce", "Pizza", "Quesadilla", "Salad"},
            {"Tomato", "Pizza", "Salad", "Sandwich"}
    };

    private String[][] testDishes2 = new String[][] {
            {"Pasta","Tomato Sauce","Onions","Garlic"},
            {"Chicken Curry","Chicken","Curry Sauce"},
            {"Fried Rice","Rice","Onions","Nuts"},
            {"Salad","Spinach","Nuts"},
            {"Sandwich","Cheese","Bread"},
            {"Quesadilla","Chicken","Cheese"}
    };
    private String[][] testResultDishes2 = new String[][] {
            {"Cheese","Quesadilla","Sandwich"},
            {"Chicken","Chicken Curry","Quesadilla"},
            {"Nuts","Fried Rice","Salad"},
            {"Onions","Fried Rice","Pasta"}
    };

    private String[][] testDishes3 = new String[][] {
            {"First","a","b","c","d","e","f","g","h","i"},
            {"Second","i","h","g","f","e","x","c","b","a"}
    };
    private String[][] testResultDishes3 = new String[][] {
            {"a","First","Second"},
            {"b","First","Second"},
            {"c","First","Second"},
            {"e","First","Second"},
            {"f","First","Second"},
            {"g","First","Second"},
            {"h","First","Second"},
            {"i","First","Second"}
    };

    @Test
    public void testGroupingDishesOne() {
        String[][] result = gr.groupingDishes(testDishes);
        assertArrayEquals(testResultDishes, result);
    }

    @Test
    public void testGroupingDishesTwo() {
        String[][] result = gr.groupingDishes(testDishes2);
        assertArrayEquals(testResultDishes2, result);
    }

    @Test
    public void testGroupingDishesThree() {
        String[][] result = gr.groupingDishes(testDishes3);
        assertArrayEquals(testResultDishes3, result);
    }
}