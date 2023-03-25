import java.util.ArrayList;

public class Store {
    String name;
    // Karena item yang akan ditambahkan dalam class Store melalui class Product tidak hanya satu, maka digunakan ArrayList agar panjang data dapat dinamis
    ArrayList<String> products = new ArrayList<>();
    ArrayList<Integer> productsPrice = new ArrayList<>();
    ArrayList<Integer> productsStock = new ArrayList<>();

    // Constructor
    public Store(String name) {
        this.name = name;
    }

    // Method untuk menambahkan produk ke dalam atribut ArrayList class Store
    // Menerima parameter objek dari class Product agar tiap tiap atribut dalam class Product dapat diakses untuk dimasukkan ke dalam ArrayList
    public void addProduct(Product prod) {
        products.add(prod.getName());
        productsPrice.add(prod.getPrice());
        productsStock.add(prod.getStock());
    }

    // Method untuk memperlihatkan apa saja isi dari atribut ArrayList
    public void showProducts() {
        System.out.println("Daftar Produk:");
        // Melakukan perulangan sebanyak panjang dari salah satu ArrayList
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s - $%d | Stok %d \n", i+1, products.get(i), productsPrice.get(i), productsStock.get(i));
        }
    }

    // Method untuk melakukan transaksi. Menerima parameter integer produk ke berapa yang ingin dibeli dan objek dari class User
    public void transaction(int prodNum, User user) {
        // Membuat instance objek dari class Product dengan parameter dari ArrayList berdasarkan indeks parameter method ini
        Product prod = new Product(products.get(prodNum), productsPrice.get(prodNum), productsStock.get(prodNum));

        // Jika stok tidak kosong
        if (prod.getStock() > 0) {
            // Jika uang user lebih besar atau sama dengan harga produk
            if (user.getBalance() >= prod.getPrice()) {
                // Uang user berkurang
                user.balance -= prod.getPrice();
                // Stok produk berkurang
                prod.itemSelled();
                // Menggunakan method set untuk memperbarui nilai/value pada ArrayList masing-masing berdasarkan proses transaksi yang telah dilakukan
                productsStock.set(prodNum, prod.getStock());
                // Jika stok sudah kosong
                if (prod.getStock() <= 0) {
                    // Maka semua data produk tersebut akan dihapus dalam masing-masing ArrayList (sesuai permintaan soal)
                    products.remove(prod.getName());
                    productsPrice.remove(Integer.valueOf(prod.getPrice()));
                    productsStock.remove(Integer.valueOf(prod.getStock()));
                }
                System.out.printf("%s berhasil membeli %s. \n", user.getName(), products.get(prodNum));
            } else {
                System.out.println("Gagal membeli barang. Uang tydack cukup deck");
            }
        } else {
            System.out.println("Maaf stok barang yang dipilih sedang tidak tersedia");
        }
    }

    // Getter untuk mengakses nama dari class Store
    public String getName() { 
        return this.name;
    }
}
