// Import class Scanner
import java.util.Scanner;

public class Nomor01 {
    public static void main(String[] args) {
        // Memanggil class Scanner untuk kebutuhan input
        Scanner inp = new Scanner(System.in);

        System.out.print("NIM : ");
        // Input ditampung dalam tipe data String
        String inputNIM = inp.nextLine();
        // Konversi String menjadi tipe data Integer menggunakan method .parseInt()
        // Menggunakan method .substring() untuk mengambil index ke-7 sampai index terakhir
        int inputNIMInt = Integer.parseInt(inputNIM.substring(7));

        // Tiga digit NIM terakhir dimodulus 7 karena soal yang tersedia ada 7
        int questNumber = inputNIMInt % 7;

        // // Cara 1 : Menggunakan switch-case untuk mengecek jika hasil modulus di atas sekaligus untuk melakukan print output
        // switch (questNumber) {
        //     case 0:
        //     // Jika hasil modulus adalah 0, maka soal yang diberikan otomatis nomor 7 karena tidak ada soal nomor 0
        //         System.out.println("Soal: no 7");
        //         break;
        //     default :
        //     // Sama seperti else statement. Jika nilai default selain 0, maka langsung print output nomor soal sesuai hasil modulus
        //         System.out.println("Soal: no " + questNumber);
        //         break;
        // };

        // Cara 2 : Mencoba menggunakan ternary operator
        System.out.println(questNumber == 0 ? "Soal: no 7" : "Soal: no " + questNumber);

        // Class ditutup agar nilai tidak bocor ke luar (terminal)
        inp.close();

        // Dokumentasi uji coba menyamakan hasil modulus dengan contoh jawaban soal --> HAPUS
        // System.out.println(49 % 7);
        // System.out.println(50 % 7);
        // System.out.println(55 % 7);
    }
}
