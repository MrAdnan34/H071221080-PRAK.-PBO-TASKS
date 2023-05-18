package No2;

public class Product<T> {
    private String name, expiryDate;
    private T price;

    public Product(String name, T price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public T getPrice() {
        return price;
    }
    public void setPrice(T price) {
        this.price = price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
