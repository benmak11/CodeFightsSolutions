package interviewpractice.hashTables;

import org.junit.Assert;
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

    @Test
    public void testGroupingDishesOne() {
        String[][] result = gr.groupingDishes(testDishes);
        Assert.assertEquals(testResultDishes, result);

    }
}