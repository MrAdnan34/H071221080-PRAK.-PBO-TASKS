public class User {
    // Mendeklarasikan atribut class User
    String name;
    int balance;

    // Constructor class User sesuai permintaan soal
    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // Behavior method untuk menampilkan CARD User
    public void showCard() {
        System.out.println("--------------" + "CARD" + "--------------");
        System.out.println(this.getName());
        System.out.println(this.getBalance());
        System.out.println("------------------------------------------");
    }

    // Method-method untuk mengakses atribut class User
    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }
}
