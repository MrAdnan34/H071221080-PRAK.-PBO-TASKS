package No1.BangunRuang;

import java.util.Scanner;

public class Kubus extends BangunRuang {
    public Kubus(double sisi) {
        this.setPanjang(sisi);
    }

    @Override
    double hitungLuasPermukaan() {
        double luas = 6 * (this.getPanjang() * this.getPanjang());
        return luas;
    }

    @Override
    double hitungVolume() {
        double volume = this.getPanjang() * this.getPanjang() * this.getPanjang();
        return volume;
    }

    public static void runKubus() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== KUBUS ===");
        System.out.println("Masukkan sisi");
        System.out.print("> ");
        int inpSisi = sc.nextInt();
        sc.nextLine();
        Kubus kubus = new Kubus(inpSisi);

        BangunRuang.reqHitung();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung) {
            case 1:
                result = kubus.hitungLuasPermukaan();
                System.out.println("Luas permukaan kubus = " + result);
                break;
            case 2:
                result = kubus.hitungVolume();
                System.out.println("Volume kubus = " + result);
                break;
            default:
                break;
        }

        sc.close();
    }
}
