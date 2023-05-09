import Car.Car;
import Dog.Bulldog;
import Smartphone.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone oddo = new Smartphone(3_000_000, "Oddo");
        Car totoya = new Car(5, "Golden Violet", 200);
        Bulldog bulldog = new Bulldog(2, 4);

        System.out.println("Brand   : " + oddo.getBrand());
        System.out.println("Price   : " + oddo.getPrice());

        System.out.println();

        System.out.println("Car's Total Forward Gear  : " + totoya.getTotalForwardGear());
        System.out.println("Car's Color               : " + totoya.getColor());
        System.out.println("Car's Max Speed           : " + totoya.getMaxSpeed());

        System.out.println();

        System.out.println("Bulldog's Average Length    : " + bulldog.getAverageLength());
        System.out.println("Position                    : " + bulldog.getPosition());
        bulldog.describe();
        bulldog.move();
    }
}
