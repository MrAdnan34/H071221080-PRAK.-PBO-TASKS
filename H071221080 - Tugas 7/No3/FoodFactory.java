package No3;

public class FoodFactory {
    public static Food getFood(String food) {
        if (food.equalsIgnoreCase("burger")) {
            return new Burger();
        } else if (food.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (food.equalsIgnoreCase("steak")) {
            return new Steak();
        } else {
            return null;
        }
    }
}
