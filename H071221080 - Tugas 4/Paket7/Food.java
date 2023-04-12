package Paket7;

public class Food {
    private String name, type;
    private double price, rating;

    public Food() {}

    public Food(String name, String type, double price, double rating) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rating = rating;
    } 

    public void displayInfo() {
        System.out.println("Display Info Food");
        System.out.println("Name    : " + this.getName());
        System.out.println("Type    : " + this.getType());
        System.out.println("Price   : " + this.getPrice());
        System.out.println("Rating  : " + this.getRating());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Menggunakan String agar format angka 0 untuk harga bisa 3 di belakang koma.
    public String getPrice() {
        return String.format("%.3f", this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
