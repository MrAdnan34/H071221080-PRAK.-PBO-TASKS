import java.util.Scanner;

public class Nomor05 {
    public static void main(String[] args) {
        // Memanggil class Scanner untuk kebutuhan input
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan tanggal : ");
        String inputDate = inp.nextLine();

        dateConversion(inputDate);

        // Class ditutup agar nilai tidak bocor ke luar (terminal)
        inp.close();
    }

    static void dateConversion(String date) {
        // Isian parameter (tanggal) ditampung dalam String Array yang dipisahkan oleh simbol dash ("-") menggunakan method .split()
        String[] dateParts = date.split("-");
        // Menyimpan tiap index parameter dalam variabel sesuai urutan untuk memudahkan menulis kode selanjutnya
        String day, month, year;
        day = dateParts[0];
        month = dateParts[1];
        year = dateParts[2];

        // Menggunakan switch-case terhadap hari index nol
        switch (day.substring(0, 1)) {
            case "0":
            // Jika index pertama adalah 0, maka langsung saja dilompati ke index selanjutnya
            // Contoh : 01 akan diubah menjadi 1
                day = day.substring(1);
        }

        // Cara 1 : Menggunakan switch-case untuk mengecek index bulan lalu mengubah sesuai angka menjadi nama bulan
        // switch (month) {
        //     case "01":
        //         month = "Januari";
        //         break;
        //     case "02":
        //         month = "Februari";
        //         break;
        //     case "03":
        //         month = "Maret";
        //         break;
        //     case "04":
        //         month = "April";
        //         break;
        //     case "05":
        //         month = "Mei";
        //         break;
        //     case "06":
        //         month = "Juni";
        //         break;
        //     case "07":
        //         month = "Juli";
        //         break;
        //     case "08":
        //         month = "Agustus";
        //         break;
        //     case "09":
        //         month = "September";
        //         break;
        //     case "10":
        //         month = "Oktober";
        //         break;
        //     case "11":
        //         month = "November";
        //         break;
        //     case "12":
        //         month = "Desember";
        //         break;
        // }

        // Cara 2 (LEBIH PENDEK) : Menyimpan tiap nama bulan dan nomor urut bulan dalam String Array yang selanjutnya akan diproses di dalam perulangan for
        String[] monthListName = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", 
        "September", "Oktober", "November", "Desember"};
        String[] monthListNum = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        for (int i = 0; i < monthListNum.length; i++) {
            // Membuat kondisi untuk mencocokkan input bulan dengan semua yang ada dalam Array nomor urut bulan
            if (month.equals(monthListNum[i])) {
                // Eksekusi kode. Mendeklarasikan ulang variabel bulan sesuai dengan isi Array nama bulan berdasarkan perulangan (i-nya)
                month = monthListName[i];
            }
        }

        // Konversi String menjadi tipe data Integer menggunakan method .parseInt()
        int yearInt = Integer.parseInt(year);
        // Karena sekarang tahun 2023, maka 2023 dan ke bawahnya akan ditambahkan "20" sebagai maksud tahun 2000-an
        if (yearInt <= 23) {
            year = "20" + year;
        } else {
            // Jadi untuk tahun 2023 ke atas masih dikonversi menjadi tahun 1900-an
            year = "19" + year;
        }

        // System.out.println(day + " " + month + " " + year);
        System.out.printf("%s %s %s", day, month, year);
    }
}
