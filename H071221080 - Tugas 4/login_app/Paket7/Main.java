package Paket7;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.setName("Mie");
        food1.setType("Indomie Goreng");
        food1.setPrice(3.000);
        food1.setRating(9.0);
        food1.displayInfo();

        System.out.println("-------------");

        Food food2 = new Food("Nasi", "Nasi Goreng", 10.000, 8.0);
        System.out.println(food2.getName());
        System.out.println(food2.getType());
        System.out.println(food2.getPrice());
        System.out.println(food2.getRating());

        System.out.println("-------------");

        SelfUtils.displaySelfData("Muh. Adnan Putra Amiruddin", "H071221080");
    }
}
