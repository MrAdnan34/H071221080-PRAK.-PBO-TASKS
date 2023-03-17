import java.util.Scanner;

public class Nomor03 {
    public static void main(String[] args) {
        // Memanggil class Scanner untuk kebutuhan input
        Scanner inp = new Scanner(System.in);

        // Menggunakan try-catch agar jika input bukan Integer, maka akan diberikan pesan untuk menginput angka
        try {
            System.out.print("Name : ");
            String name = inp.nextLine();
    
            System.out.print("Umur : ");
            int age = inp.nextInt();

            inp.nextLine();

            System.out.print("Hobby : ");
            String hobby = inp.nextLine();
    
            // System.out.println("Nama saya " + name + ", " + age + " tahun, hobby " + hobby);
            System.out.printf("Nama saya %s, %d tahun, hobby %s", name, age, hobby);
        } catch (Exception e) {
            System.out.println("Input umur harus berupa tipe data integer (angka)");
        };

        // Class ditutup agar nilai tidak bocor ke luar (terminal)
        inp.close();
    }
}
