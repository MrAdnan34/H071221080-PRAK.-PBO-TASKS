import java.util.Scanner;

public class Nomor04 {
    public static void main(String[] args) {
        // Memanggil class Scanner untuk kebutuhan input
        Scanner inp = new Scanner(System.in);

        System.out.println("Masukkan Judul Film : ");
        System.out.print("> ");
        String movieTitle = inp.nextLine();

        // Class ditutup agar nilai tidak bocor ke luar (terminal)
        inp.close();

        // Memanggil method
        toPascalCase(movieTitle);
    }

    static void toPascalCase(String title) {
        // Isian parameter (judul film) ditampung dalam String Array yang dipisahkan oleh spasi (" ") menggunakan method .split()
        String[] titleParts = title.split(" ");
        
        for (int i = 0; i < titleParts.length; i++) {
            // Setiap index inputan yang telah ditampung akan ditampung lagi dalam variabel parts untuk memudahkan menulis kode selanjutnya
            String parts = titleParts[i];
            // Menggunakan method .substring() untuk mengambil index ke-0 sampai 1 untuk dikonversi menjadi huruf kapital
            // Berikutnya akan ditambah dengan string index ke-1 sampai index terakhir yang dikonversi menjadi huruf kecil
            parts = parts.substring(0, 1).toUpperCase() + parts.substring(1).toLowerCase();
            System.out.print(parts + " ");
        };
    }
}
