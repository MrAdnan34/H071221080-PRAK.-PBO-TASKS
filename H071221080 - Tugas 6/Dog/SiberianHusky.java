package Dog;
import Interface.Interface;

public class SiberianHusky extends Dog implements Interface {

    public SiberianHusky() {}

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 2;
        System.out.println("Now, Siberian Husky is in " + this.getPosition());
    }

    @Override
    public void describe() {
        System.out.println("ubuh sedang dengan berat antara 16-27 kg. Bulu tebal dan halus, umumnya berwarna putih, hitam, atau abu-abu dengan belang-belang hitam atau coklat. Mata biru atau coklat dengan bentuk almond yang khas, dan telinga tegak dengan rumbai di ujungnya.");
    }
    
}
