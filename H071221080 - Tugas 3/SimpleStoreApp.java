import java.util.Scanner;

public class SimpleStoreApp {
    public static void main(String[] args) {
        Store store = new Store("Toko-tokoan");
        User user = new User("Nguser", 10000);

        // Membuat objek dari class Product dengan nama yang berbeda-beda
        Product prod1 = new Product("Lenobot", "3k", 10);
        Product prod2 = new Product("Ngazus", 4000, 10);
        Product prod3 = new Product("Asel", "5K", 10);

        // Menambahkan tiap objek ke dalam ArrayList objek dari class Store
        store.addProduct(prod1);
        store.addProduct(prod2);
        store.addProduct(prod3);

        // Memanggil method yang telah dibuat di bawah untuk menjalankan proses transaksi toko
        runStore(store, user);
    }

    // Membuat method untuk melakukan proses penampilan produk dan transaksi pada toko
    public static void runStore(Store store, User user) {
        Scanner inp = new Scanner(System.in);

        user.showCard();
        System.out.println("Selamat datang di " + store.getName());
        store.showProducts();
        System.out.println("0. Keluar");
        System.out.print("> ");

        // Menggunakan try-catch untuk meng-handle jika yang diinput bukan bertipe data Integer
        try {
            int responOption = inp.nextInt();
            // Untuk memilih produk, maka nilai yang diinput akan dikurangi satu agar dapat mengakses index dari ArrayList class Store
            int responProd = responOption - 1;

            // Jika inputan adalah 0, maka akan menghentikan method berjalan dengan menggunakan sintaks return sebagai bentuk penghentian
            if (responOption == 0) {
                System.out.println("============================================");
                System.out.printf("Sisa uang anda: %d \n", user.getBalance());
                System.out.println("Terima kasih telah berkunjung mas");
                System.out.println("============================================");
                inp.close();
                return;
            }

            // Jika yang diinput angka 0, maka pasti variabel yang dikurang satu tadi akan menjadi -1. Sedangkan -1 akan mengembalikan error index out of length
            if (responProd < 0) {
                // Jadi solusinya adalah indeks tersebut diubah nilainya menjadi 0
                responProd = 0;
            }

            // Jika nilai tersebut melebihi batas indeks, maka permintaan akan ditolak
            if (responOption > store.products.size()) {
                System.out.println("============================================");
                System.out.println("Input out of size. Maaf, opsi tidak ada");
                System.out.println("============================================");
                // Lalu memanggil kembali method di atas (rekursif)
                runStore(store, user);
            }

            System.out.println("Afakah saudara yaqin membeli:");
            // Di sini barulah menggunakan variabel yang dikurangi 1 tadi sebagai acuan untuk mendapatkan data produk dalam ArrayList
            System.out.printf("%s, dengan harga $%d ? \n", store.products.get(responProd), store.productsPrice.get(responProd));
            System.out.println("1. Konfirmasi");
            System.out.println("2. Batal");
            System.out.print("> ");
            int responConfirmBuy = inp.nextInt();

            // Jika dikonfirmasi, maka akan melanjutkan proses transaksinya
            if (responConfirmBuy == 1) {
                // Memanggil method transaction dari class Store untuk melakukan logika transaksinya
                store.transaction(responProd, user);
                System.out.println("--------------------------------------------");
                System.out.println("Lanjutkan Transaksi bang?");
                System.out.println("1. Iya");
                System.out.println("2. Tidak");
                System.out.print("> ");
                int responConfirmAction = inp.nextInt();

                // Jika user mengonfirmasi untuk lanjut, maka method ini akan dipanggil lagi sehingga akan dimulai kembali dari atas tetapi dengan data-data seperti uang user yang sudah diperbaharui
                if (responConfirmAction == 1) {
                    // Teknik ini disebut method rekursif
                    runStore(store, user);
                } else {
                    System.out.println("============================================");
                    System.out.printf("Sisa uang anda: %d \n", user.getBalance());
                    System.out.println("Terima kasih telah berbelanja mas");
                    System.out.println("============================================");
                    inp.close();
                    return;
                }
            // Jika pilihan adalah 2 (Batal), maka akan mengembalikan menu ke awal (rekursif)
            } else if (responConfirmBuy == 2) {
                runStore(store, user);
            }
        } catch (Exception e) {
            System.out.println("============================================");
            System.out.println("Input error. Opsi tidak ada!");
            System.out.println("Program error, aplikasipun keluar. Awokawoqkkwok");
            System.out.println("============================================");
            inp.close();
            return;
        }
        inp.close();
    }
}
