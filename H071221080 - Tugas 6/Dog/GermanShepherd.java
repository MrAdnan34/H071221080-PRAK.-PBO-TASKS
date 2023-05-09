package Dog;
import Interface.Interface;

public class GermanShepherd extends Dog implements Interface {

    public GermanShepherd() {}

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("Now, German Shepherd is in " + this.getPosition());
    }

    @Override
    public void describe() {
        System.out.println("Tubuh besar dan kuat dengan berat antara 30-40 kg. Bulu panjang dan tebal, umumnya berwarna coklat atau hitam dengan belang-belang coklat atau kuning.");
    }
}
