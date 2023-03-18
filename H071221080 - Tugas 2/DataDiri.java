public class DataDiri {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Jl. Ade Irma";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Muh. Adnan Putra Amiruddin";
        mahasiswa.nim = "H071221080";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}

class Alamat {
    String jalan, kota;

    String getAlamat() {
        return this.jalan;
    }

    String getAlamatLengkap() {
        return this.jalan + ", " + this.kota;
    }
}

class Mahasiswa {
    String nama, nim, jalan;
    // Memanggil class Alamat dan mendeklarasikannya sebagai objek dalam class ini (class Mahasiswa) karena dalam soal meminta atribut alamat mahasiswa diwariskan dari class Alamat yang dideklarasikan sebelumnya.
    Alamat alamat = new Alamat();

    String getNama() {
        return this.nama;
    }

    String getNim() {
        return this.nim;
    }


    // Membuat method yang meminta class Mahasiswa yang dikembalikan (return)
    Mahasiswa getAlamat() {
        // Mendeklarasikan atribut jalan pada class Mahasiswa.
        // Karena objek dari class Alamat sudah dibuat di atas, maka behavior method dalam class tersebut pun dapat diakses. Di sini menggunakan method getAlamat() untuk mendapatkan nama jalan tempat tinggal mahasiswa tersebut.
        this.jalan = alamat.getAlamat();
        // Karena fungsi meminta class yang di-return, maka di sini yang dikembalikan ialah keyword this.
        // return this akan mengembalikan instance objek saat ini, sehingga method getAlamat() tetap menganggap return this sebagai objek yang dikembalikan.
        return this;
    }

    // Mengapa method getAlamat() harus return objek? Mengapa tidak langsung return String saja?
    // Itu karena di dalam soal meminta dua method dijalankan dalam satu line secara berurutan/berantai.
    // Istilahnya dalam hal ini ialah "Method Chaining (in Java)".

    // Jadi setelah ini, method selanjutnya yaitu getAlamatLengkap() bisa dijalankan karena method sebelumnya yaitu getAlamat() akan dianggap sebagai atribut dalam class Mahasiswa karena yang dikembalikan ialah objek itu sendiri.

    // Sumber belajar: 
    // https://stackoverflow.com/questions/39406456/how-to-call-two-methods-in-same-class
    // https://www.geeksforgeeks.org/method-chaining-in-java-with-examples/

    String getAlamatLengkap() {
        // Memanggil atribut jalan pada class Mahasiswa lalu digabungkan dengan atribut kota pada class Alamat.
        return this.jalan + ", " + alamat.kota;
    }
}
