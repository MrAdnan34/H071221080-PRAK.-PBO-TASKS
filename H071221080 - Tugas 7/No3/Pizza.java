package No3;

public class Pizza implements Food {
    private int price = 150_000;

    @Override
    public int getPrice() {
        return price;
    }
}
