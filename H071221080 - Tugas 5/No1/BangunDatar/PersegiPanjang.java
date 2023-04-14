package No1.BangunDatar;

import java.util.Scanner;

public class PersegiPanjang extends BangunDatar {
    public PersegiPanjang(double panjang, double lebar) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
    }

    @Override
    double hitungLuas() {
        double luas = this.getPanjang() * this.getLebar();
        return luas;
    }

    @Override
    double hitungKeliling() {
        double keliling = (2 * this.getPanjang()) + (2 * this.getLebar());
        return keliling;
    }

    public static void runPersegiPanjang() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Masukkan panjang");
        System.out.print("> ");
        int inpPanjang = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Masukkan lebar");
        System.out.print("> ");
        int inpLebar = sc.nextInt();
        sc.nextLine();
        PersegiPanjang persegiPanjang = new PersegiPanjang(inpPanjang, inpLebar);

        BangunDatar.reqHitung();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung) {
            case 1:
                result = persegiPanjang.hitungLuas();
                System.out.println("Luas persegi panjang = " + result);
                break;
            case 2:
                result = persegiPanjang.hitungKeliling();
                System.out.println("Keliling persegi panjang = " + result);
                break;
            default:
                break;
        }

        sc.close();
    }
}
