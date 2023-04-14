package No1.BangunRuang;

import java.util.Scanner;

public class Tabung extends BangunRuang {
    public Tabung(double jariJari, double tinggi) {
        this.setJariJari(jariJari);
        this.setTinggi(tinggi);
    }

    @Override
    double hitungLuasPermukaan() {
        double luasAlas = this.getPi() * (this.getJariJari() * this.getJariJari());
        double luasSelimut = 2 * this.getPi() * this.getJariJari() * this.getTinggi();
        double luasTotal = 2 * luasAlas + luasSelimut;
        return luasTotal;
    }

    @Override
    double hitungVolume() {
        double volume = this.getPi() * (this.getJariJari() * this.getJariJari()) * this.getTinggi();
        return volume;
    }

    public static void runTabung() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TABUNG ===");
        System.out.println("Masukkan jari-jari");
        System.out.print("> ");
        int inpJariJari = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan tinggi");
        System.out.print("> ");
        int inpTinggi = sc.nextInt();
        sc.nextLine();
        Tabung tabung = new Tabung(inpJariJari, inpTinggi);

        BangunRuang.reqHitung();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung) {
            case 1:
                result = tabung.hitungLuasPermukaan();
                System.out.println("Luas permukaan tabung = " + result);
                break;
            case 2:
                result = tabung.hitungVolume();
                System.out.println("Volume tabung = " + result);
                break;
            default:
                break;
        }

        sc.close();
    }
}
