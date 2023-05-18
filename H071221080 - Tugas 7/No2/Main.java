package No2;

public class Main {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<Integer>("Kinder Joy", 10_000, "2023-05-01");
        Product<String> product2 = new Product<String>("Sari Roti", "Rp 15.000", "2023-05-20");
        Product<Double> product3 = new Product<Double>("Susu Kurma", 7.5, "2023-06-01");

        System.out.println(String.format("Product 1: %s - %s - %s", product1.getName(), product1.getPrice(), product1.getExpiryDate()));

        System.out.println(String.format("Product 2: %s - %s - %s", product2.getName(), product2.getPrice(), product2.getExpiryDate()));

        System.out.println(String.format("Product 3: %s - %s - %s", product3.getName(), product3.getPrice(), product3.getExpiryDate()));
    }
}
