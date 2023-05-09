package Dog;
import Interface.Interface;

public class Pitbull extends Dog implements Interface {

    public Pitbull() {}

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("Now, Pitbull is in " + this.getPosition());
    }

    @Override
    public void describe() {
        System.out.println("Tubuh yang kuat dan padat dengan berat antara 14-27 kg. Kepala besar dan lebar, dengan rahang yang kuat dan gigi yang tajam. Bulu pendek dan halus, umumnya berwarna hitam, putih, atau belang-belang.");
    }
    
}