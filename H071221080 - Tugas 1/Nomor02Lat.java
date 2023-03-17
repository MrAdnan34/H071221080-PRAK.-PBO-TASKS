import java.util.Scanner;

public class Nomor02Lat {
    public static void main(String[] args) {
        // Memanggil class Scanner untuk kebutuhan input
        Scanner inp = new Scanner(System.in);

        System.out.print("Jumlah : ");
        int jumlah = inp.nextInt();

        inp.nextLine();

        System.out.print("Angka : ");
        // Input ditampung dalam tipe data String Array yang dipisahkan oleh spasi (" ") menggunakan method .split()
        String numbers = inp.nextLine();

        // Memanggil fungsi
        defineDataType(jumlah, numbers);

        // Class ditutup agar nilai tidak bocor ke luar (terminal)
        inp.close();
    }

    // Latihan : Pindahkan operasi hitungan ke method baru
    static void defineDataType(int inputJumlah, String inputNumber) {
        // Input parameter dikonversi menjadi String Array yang dipisahkan oleh spasi (" ") menggunakan method .split()
        String[] numbers = inputNumber.split(" ");
        // Deklarasi total bilangan bulat dan desimal yang nantinya akan bertambah setelah dilakukan perulangan dibawah
        int bilBulat = 0;
        int bilDesimal = 0;
        for (int i = 0; i < inputJumlah; i++) {
            // Setiap index inputan akan ditampung dalam variabel number untuk memudahkan menulis kode selanjutnya
            String number = numbers[i];
            // Menggunakan try-catch agar jika dalam proses ubah tipe data ke Integer, bilangan desimal yang harusnya error akan lanngsung diopor ke kolom catch untuk diubah ke tipe data Double
            try {
                // Konversi String menjadi tipe data Integer menggunakan method .parseInt()
                int numInt = Integer.parseInt(number);
                bilBulat++;
            } catch (Exception e) {
                // String yang gagal dikonversi di atas maka akan keluar sebagai error dan akan ditangkap di kolom catch untuk diubah menjadi tipe data Double menggunakan method .parseDouble()
                double numDecimal = Double.parseDouble(number);
                bilDesimal++;
            }
        };
        System.out.println(bilBulat + " Bilangan Bulat");
        System.out.println(bilDesimal + " Bilangan Desimal");
    }
}
