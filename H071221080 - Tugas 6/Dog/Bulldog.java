package Dog;
import Interface.Interface;

public class Bulldog extends Dog implements Interface {

    public Bulldog() {}

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 1;
        System.out.println("Now, Bulldog is in " + this.getPosition());
    }

    @Override
    public void describe() {
        System.out.println("Wajah datar, hidung pesek, badan pendek dan padat dengan berat sekitar 18-23 kg. Bulu pendek dan lembut, umumnya berwarna putih, abu-abu, atau coklat.");
    }
}
