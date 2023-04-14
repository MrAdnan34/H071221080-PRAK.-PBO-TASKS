package No1.BangunDatar;

public class BangunDatar {
    final private double pi = 3.14;
    private double panjang, lebar, alas, tinggi, r;

    double hitungLuas() {
        double luas = 0;
        return luas;
    }

    double hitungKeliling() {
        double keliling = 0;
        return keliling;
    }

    protected static void reqHitung() {
        System.out.println("====================");
        System.out.println("1. Luas Permukaan \n2. Volume");
        System.out.println("Mau hitung apa?");
        System.out.print("> ");
    }

    protected double getPi() {
        return pi;
    }

    protected double getPanjang() {
        return panjang;
    }
    protected void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    protected double getLebar() {
        return lebar;
    }
    protected void setLebar(double lebar) {
        this.lebar = lebar;
    }

    protected double getAlas() {
        return alas;
    }
    protected void setAlas(double alas) {
        this.alas = alas;
    }

    protected double getTinggi() {
        return tinggi;
    }
    protected void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    protected double getJariJari() {
        return r;
    }
    protected void setJariJari(double r) {
        this.r = r;
    }
}
