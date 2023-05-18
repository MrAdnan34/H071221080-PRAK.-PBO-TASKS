package No3;

import java.util.List;

public class Restaurant {
    // List merupakan Abstract Class untuk ArrayList
    public static int calculateTotal(List<Food> foods) {
        int total = 0;
        for (Food food : foods) {
            total += food.getPrice();
        }
        return total;
    }
}
