package No2;

public class Main {
    public static void main(String[] args) {
        PengurusInti ketua = new PengurusInti("Adnan", "Male", 18, "Ketua");

        Koordinator kord1 = new Koordinator("Adnan 2", "Male", 18, "FrontEnd Developer");
        Koordinator kord2 = new Koordinator("Adnan 3", "Male", 18, "Machine Learning Engineer");

        System.out.println("=====");
        ketua.showData();
        System.out.println("=====");
        kord1.showData();
        System.out.println("=====");
        kord2.showData();

        System.out.println("=====");
        ketua.addMember(2);
        kord1.doTask();
        kord2.doTask();
    }
}
