import java.util.Scanner;

public class Nomor08 {
    public static void main(String[] args) {
        // Memanggil class Scanner untuk kebutuhan input
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11}, {12}, {13, 14, 15, 16}};

        Scanner inp = new Scanner(System.in);

        try {
            System.out.print("Input number you want to search for : ");
            int inputNumber = inp.nextInt();

            for (int i = 0; i < nums.length; i++) {
                // Ditambahkan nums index ke-i untuk mengakses Array dimensi kedua
                for (int j = 0; j < nums[i].length; j++) {
                    int num = nums[i][j];
                    // Melakukan pengecekan apabila nums index ke-i dan j sama dengan nilai inputan number, maka eksekusi kode sesuai arahan soal
                    if (num == inputNumber) {
                        System.out.println("Found " + inputNumber + " at [" + i + "][" + j + "]");
                        // Menghentikan perulangan agar setelah angka yang ingin dicari telah ditemukan, maka perulangan untuk mengecek angka selanjutnya dihentikan
                        break;
                    }
                }
            };
        } catch (Exception e) {
            System.out.println("Input harus bertipe data Integer (angka)");
        }

        // Class ditutup agar nilai tidak bocor ke luar (terminal)
        inp.close();
    }
}
