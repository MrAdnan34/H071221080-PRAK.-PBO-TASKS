package No1.BangunDatar;

import java.util.Scanner;

public class Trapesium extends BangunDatar {
    // Membuat variabel baru untuk trapesium karena bisa saja ada 4 sisi yang berbeda-beda
    private double sisi3, sisi4;

    public Trapesium(double sisi1AB, double sisi2BC, double sisi3CD, double sisi4DA) {
        // Sisi 1 ditaro di variabel Panjang
        this.setPanjang(sisi1AB);
        // Sisi 2 ditaro di variabel Lebar
        this.setLebar(sisi2BC);
        this.setSisi3(sisi3CD);
        this.setSisi4(sisi4DA);
    }

    @Override
    double hitungLuas() {
        double luas = (this.getPanjang() + this.getSisi3()) * this.getTinggi() / 2;
        return luas;
    }

    @Override
    double hitungKeliling() {
        double keliling = this.getPanjang() + this.getLebar() + this.getSisi3() + this.getSisi4();
        return keliling;
    }

    public double getSisi3() {
        return sisi3;
    }
    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    public double getSisi4() {
        return sisi4;
    }
    public void setSisi4(double sisi4) {
        this.sisi4 = sisi4;
    }

    public static void runTrapesium() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TRAPESIUM ===");
        System.out.println("Masukkan sisi 1 (AB)");
        System.out.print("> ");
        int inpSisi1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan sisi 2 (BC)");
        System.out.print("> ");
        int inpSisi2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan sisi 3 (CD)");
        System.out.print("> ");
        int inpSisi3 = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan sisi 4 (DA)");
        System.out.print("> ");
        int inpSisi4 = sc.nextInt();
        sc.nextLine();
        Trapesium trapesium = new Trapesium(inpSisi1, inpSisi2, inpSisi3, inpSisi4);

        BangunDatar.reqHitung();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung) {
            case 1:
                result = trapesium.hitungLuas();
                System.out.println("Luas trapesium = " + result);
                break;
            case 2:
                result = trapesium.hitungKeliling();
                System.out.println("Keliling trapesium = " + result);
                break;
            default:
                break;
        }

        sc.close();
    }
}
