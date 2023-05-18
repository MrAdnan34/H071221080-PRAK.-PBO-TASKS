package No3;

public class Burger implements Food {
    private int price = 20_000;

    @Override
    public int getPrice() {
        return price;
    }
}
