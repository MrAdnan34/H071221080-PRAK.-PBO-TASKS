public class MainKang {
    public static void main(String[] args) {
        KangIdentity identity1 = new KangIdentity();
        identity1.setWeapon("Tongkat");
        identity1.setUniverse(686);

        KangVariant kang1 = new KangVariant("Ramatut", 616, 100);
        kang1.setWeapon(identity1.getWeapon());
        kang1.setUniverse(identity1.getUniverse());

        KangIdentity identity2 = new KangIdentity("Armor", 737);

        KangVariant kang2 = new KangVariant();
        kang2.setName("Scarlet Centaurin");
        kang2.setWeapon(identity2.getWeapon());
        kang2.setUniverse(identity2.getUniverse());
        kang2.setTroops(90);

        System.out.println("================");
        kang1.checkStatus();
        System.out.println("================");
        kang2.checkStatus();

        kang1.summonTroops(10);
        System.out.println("================");
        kang1.checkStatus();

        kang1.launchBattleTo(kang2);
        kang1.travelToUniverse(kang2.getUniverse());
        kang1.launchBattleTo(kang2);

        System.out.println("================");
        kang1.checkStatus();
        System.out.println("================");
        kang2.checkStatus();

        kang2.launchWarTo(kang1);
        kang2.travelToUniverse(989);
        kang1.launchWarTo(kang2);

        System.out.println("================");
        kang1.checkStatus();
        System.out.println("================");
        kang2.checkStatus();
    }
}
