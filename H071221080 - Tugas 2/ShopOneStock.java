class Shop {
    String id, name;
    boolean stock;
    double price;

    // Method untuk mengecek data produk dalam objek
    void checkProduct() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.stock ? "Ada" : "Tidak Ada");
        System.out.println(String.format("Rp. %.3f \n", this.price));
    }

    // Method untuk mengecek apakah stok produk tersebut ada atau tidak
    void checkStock() {
        // Jika stocknya bernilai true, maka langsung memberikan info bahwa produknya tersedia.
        if (this.stock) {
            System.out.println("Ya, produk tersedia");
        } else {
            // Begitupun sebaliknya.
            System.out.println("Maaf, produk tidak tersedia");
        }
    }
}

// Sama seperti kasus pada Main.java, di sini juga karena main class ada di bawah, maka butuh di-compile terlebih dahulu agar class ShopOneStock dapat dijalankan dengan mengabaikan class di atas (class Shop).

public class ShopOneStock {
    public static void main(String[] args) {
        // Memanggil class untuk membuat objek
        Shop noodleShop = new Shop(); 

        // Menginisialisasi tiap atribut dari objek.
        noodleShop.id = "A01";
        noodleShop.name = "Indomie Goreng";
        noodleShop.stock = true;
        noodleShop.price = 2.500;

        noodleShop.checkProduct();
        noodleShop.checkStock();
    }
}
