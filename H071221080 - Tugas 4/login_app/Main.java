package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }
    
    private static void runApp() {
        // Menu Utama Aplikasi
            System.out.println("-------------------------");
            System.out.println("Aplikasi Login Sederhana");
            System.out.println("-------------------------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("> ");
    
            try {
                // Menginput pilihan menu
                int selectMenu = sc.nextInt();
                sc.nextLine();
                switch (selectMenu) {
                    case 1:
                        // Membuka Halaman Login
                        showLoginMenu();
                        break;
                    case 2:
                        // Membuka Halaman Register
                        showRegisterMenu();
                        break;
                    case 3:
                        // Keluar
                        System.out.println("Terima kasih telah berkunjung");
                        break;
                    default:
                        // Mengulang Pemanggilan Menu Utama
                        System.out.println("WARNING: Menu hanya 1 atau 2");
                        runApp();
                }
            } catch (Exception e) {
                System.out.println("ERROR: Inputan harus berupa angka!!!");
                sc.nextLine();
                runApp();
            }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            /*
             * TODO
             * Buatlah sebuah perkondisian (IF) yang akan
             * Mengecek apakah user index ke i dari listUser memiliki username yang sama
             * dengan username yang
             * diinput.
             * Jika ada ganti userIndex dengan Index dari User Tersebut, kemudian hentikan
             * perulangan
             */
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            /*
             * TODO
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */
            boolean isPasswordMatch = false;
            if (listUser.get(userIndex).getPassword().equals(password)) {
                isPasswordMatch = true;
            }

            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                /*
                 * TODO
                 * panggil method showDetailUser dan kirimkan data Profile User yang login
                 * 
                 */
                String fullName = listUserProfile.get(userIndex).getFullName();
                int age = listUserProfile.get(userIndex).getAge();
                String hobby = listUserProfile.get(userIndex).getHobby();
                String nickName = listUserProfile.get(userIndex).getNickName();
                Profile profile = new Profile(fullName, age, hobby, nickName);
                showDetailUser(profile);
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
                runApp();
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        String username, password;
        // Memberikan label outerloop karena nanti akan dibreak di dalam for loop
        outerloop:
        while (true) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            if (listUser.size() > 0) {
                // Melakukan pengecekan apakah data user sudah terdaftar
                for (User user : listUser) {
                    if (user.getUsername().equals(username)) {
                            System.out.println("WARNING: Data dengan Username tersebut sudah terdaftar!");
                    } else {
                        break outerloop;
                    }
                }
            } else {
                // Melakukan pengecekan apakah inputan username tidak kosong
                if (!username.isBlank()) {
                    break;
                }
            }
            if (username.isBlank()) {
                System.out.println("ERROR: Inputan username tidak boleh kosong!!!");
            }
        }
        while (true) {
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.length() >= 8) {
                break;
            }
            System.out.println("ERROR: Inputan password minimal 8 karakter!!!");
        }
        /*
         * TODO
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */
        User user = new User(username, password);

        /*
         * TODO
         * Buatlah atau Instance objek Profile baru
         */
        Profile profile = new Profile();

        String fullName, hobby;
        int age;
        while (true) {
            try {
                System.out.println("Nama Lengkap");
                System.out.print("> ");
                fullName = sc.nextLine();
                System.out.println("Umur");
                System.out.print("> ");
                age = sc.nextInt();
                sc.nextLine();
                System.out.println("Hobby");
                System.out.print("> ");
                hobby = sc.nextLine();
                System.out.println("ERROR: Tidak boleh ada inputan yang kosonng!!!");
                if (!fullName.isBlank() && !hobby.isEmpty()) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("ERROR: Input umur harus berupa angka");
                sc.nextLine();
            }
        }

        // Menginput Data Profile

        /*
         * TODO
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);

        /*
         * TODO
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */
        String nickName = StringUtils.setNickName(profile.getFullName());
        profile.setNickName(nickName);

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }
    
    private static void showDetailUser(Profile profile) {
        /*
        * TODO *
        * Tampilkan semua data profile user yang login
        */
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap    : " + profile.getFullName());
        System.out.println("Nama Panggilan  : " + profile.getNickName());
        System.out.println("Umur            : " + profile.getAge());
        System.out.println("Hobby           : " + profile.getHobby());
        System.out.println("-------------------------");
    }
}
