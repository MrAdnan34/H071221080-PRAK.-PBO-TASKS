class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        // Lengkapi
        // Membuat variabel dengan tipe data double untuk menampung rumus mencari volume Cuboid lalu variabel inilah yang akan dikembalikan untuk fungsi getVolume()
        double result = this.height * this.width * this.length;
        return result;
    }
}

// Meng-compile class agar public class Main dapat dijalankan dengan baik. Jika tidak di-compile, maka ketika file di-run akan menganggap class Cuboid di atas sebagai kelas utama karena posisinya di atas. Akan muncul output di terminal yang mencari main method dari class Cuboid, sedangkan yang kita mau sebagai kelas utama ialah class Main yang ada di bawah ini. 

// Itulah sebabnya semua di-compile terlebih dahulu, lalu tinggal jalankan class Main yang di bawah ini.

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        
        // Lengkapi
        // Mendeklarasikan atribut tiap class agar method getVolume() bisa berfungsi
        cuboid.height = 20;
        cuboid.width = 15;
        cuboid.length = 15;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
