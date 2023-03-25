public class Product {
    // Mendeklarasikan atribut class Product
    String name;
    int price, stock;

    // Constructor class Product sesuai permintaan soal
    public Product(String name, int price, int stock) {
        // Tiap parameter dari constructor akan dijadikan nilai pada atribut class
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock) {
        this.name = name;
        // Menggunakan method bawaan Java yaitu .replace untuk mengganti huruf "k" atau "K" menjadi 3 angka 0
        price = price.replace("k", "000").replace("K", "000");
        // Lalu yang tadinya String akan dikonfersikan menjadi tipe data Integer agar dapat dijadikan nilai pada atribut harga/price pada class Product
        Integer priceInt = Integer.parseInt(price);
        this.price = priceInt;
        this.stock = stock;
    }

    // Method jika product terjual, maka atribut stock akan dikurangi 1
    public int itemSelled() {
        this.stock -= 1;
        return this.stock;
    }

    // Method-method untuk mengakses atribut class Product
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }
}
