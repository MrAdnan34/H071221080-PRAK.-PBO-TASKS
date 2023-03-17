import java.util.Scanner;

public class Nomor07 {
    // Deklarasi String Array di luar blok main agar dapat diakses di blok kode mana saja (Global Variabel)
    static String[] animals = {"Kucing", "Ayam", "Sapi", "Semut", "Harimau", "Anjing", "Singa", 
    "Macan", "Beruang", "Kuda", "Kambing", "Bebek", "Kerbau", "Banteng", "Ikan", "Elang"};

    public static void main(String[] args) {
        // Memanggil class Scanner untuk kebutuhan input
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Key : ");
        String inputAnimal = inp.next();
        // Mengkonversi input sebagai lower case (huruf kecil) karena soal meminta mengabaikan case sensitive
        // inputAnimal = inputAnimal.toLowerCase();

        // Memanggil fungsi
        int indexAnimal = findIndex(inputAnimal);
        System.out.println(indexAnimal);

        // Class ditutup agar nilai tidak bocor ke luar (terminal)
        inp.close();
    }
    
    static int findIndex(String text) {
        // Mengkonversi parameter sebagai lower case (huruf kecil) karena soal meminta mengabaikan case sensitive
        text = text.toLowerCase();

        // Nilai default -1 karena soal meminta kembalikan nilai -1 jika index tidak ditemukan
        int result = -1;
        for (int i = 0; i < animals.length; i++) {
            String animal = animals[i];
            // Konversi tiap index animal sebagai lower case agar dapat dibandingkan dengan parameter fungsi
            animal = animal.toLowerCase();
            
            // animal.equalsIgnoreCase(animal);
            if (animal.equals(text)) {
                // Index ditambah satu untuk mengembalikan nilai default -1 ke index sebenarnya
                result += i+1;
            }
        };
        return result;
    }
}
