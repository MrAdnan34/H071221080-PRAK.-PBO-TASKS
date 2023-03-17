import java.util.Scanner;

public class Nomor06 {
    public static void main(String[] args) {
        // Memanggil class Scanner untuk kebutuhan input
        Scanner inp = new Scanner(System.in);

        System.out.print("Jari-Jari lingkaran : ");
        int inputRadius = inp.nextInt();

        // Deklarasi variabel hasil dengan nilai 0 yang ke depannya akan ditambahkan dengan hasil operasi di bawah
        double result = 0;

        try {
            result += 3.14 * inputRadius * inputRadius;
            // Menggunakan string format %.2f agar output dua angka di belakang koma
            System.out.println("Luas lingkaran dengan jari-jari " + inputRadius + " cm adalah : " + String.format("%.2f", result) + " cm");
        } catch (Exception e) {
            System.out.println("Input jari-jari lingkaran harus bertipe data integer (angka)");
        }

        // Class ditutup agar nilai tidak bocor ke luar (terminal)
        inp.close();
    }
}
