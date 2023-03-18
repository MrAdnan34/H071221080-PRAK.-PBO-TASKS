import java.util.ArrayList;

public class ShopMultiStocks {
    // Menggunakan ArrayList agar Array dapat dinamis
    ArrayList<String> productsId = new ArrayList<>();
    ArrayList<String> productsName = new ArrayList<>();
    ArrayList<Boolean> productsStock = new ArrayList<>();
    ArrayList<Double> productsPrice = new ArrayList<>(); 

    public static void main(String[] args) {
        // Memanggil class untuk membuat objek
        ShopMultiStocks shop = new ShopMultiStocks();

        // Menambahkan data produk ke dalam Array List 
        shop.addProduct("A01", "Indomie Goreng", true, 2.500);
        shop.addProduct("A02", "Indomie Soto", false, 2.000);
        shop.addProduct("B01", "Nasi Goreng", true, 12.000);

        shop.checkProduct();

        shop.checkStock("Indomie GorEng");
        shop.checkStock("Indomie Soto");
        shop.checkStock("Nasi Goreng");
    }

    // Method untuk menambahkan data ke dalam Array List dengan menerima 4 parameter
    void addProduct(String id, String name, boolean stock, double price) {
        // Menggunakan method add untuk menambahkan isi parameter ke masing-masing Array
        productsId.add(id);
        productsName.add(name);
        productsStock.add(stock);
        productsPrice.add(price);
    }

    // Method untuk mengecek semua data produk yang ada dalam Array List menggunakan perulangan fori
    void checkProduct() {
        // Untuk mengakses length dari Array List, menggunakan method .size()
        for (int i = 0; i < productsId.size(); i++) {
            System.out.printf("Produk %d : \n", i+1);
            System.out.printf("ID       : %s \n", productsId.get(i));
            System.out.printf("Nama     : %s \n", productsName.get(i));
            // Jika productsStocks index ke-i bernilai true, maka akan memberikan output "Tersedia", begitu pun dengan nilai false.
            // Menggunakan teknik ternary operator
            System.out.printf("Stok     : %s \n", productsStock.get(i) ? "Tersedia" : "Tidak tersedia");
            System.out.printf("Harga    : Rp. %.3f \n \n", productsPrice.get(i));
        }
        System.out.printf("--> Total ada %d produk \n \n", productsId.size());
    }

    // Method untuk mengecek apakah stok tersedia atau tidak.
    void checkStock(String name) {
        String result = String.format("Maaf, produk dengan nama %s tidak tersedia ", name);
        // Melakukan perulangan untuk mengecek setiap index dalam Array List nama produk.
        for (int i = 0; i < productsName.size(); i++) {
            // Lalu membandingkan tiap index tersebut apakah sama dengan parameter method dan jika pada Array List stock index tersebut bernilai benar, maka langsung memberikan info bahwa produk tersedia.
            if (productsName.get(i).equalsIgnoreCase(name) && productsStock.get(i)) {
                result = String.format("Ya, produk dengan nama %s tersedia", name);
                break;
            }
        }
        // Jika kondisi tidak terpenuhi dalam perulangan, maka langsung memberikan info bahwa produknya tidak tersedia.
        System.out.println(result);
    }
}
