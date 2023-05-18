package No3;

public class Steak implements Food {
    private int price = 45_000;

    @Override
    public int getPrice() {
        return price;
    }
}
