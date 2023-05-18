package No1;

public class Mage extends Character {

    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    public int attack() {
        return getAttackPower();
    }

    @Override
    public int attack(String attackType) {
        return attackType.equals("frost") ? getAttackPower() * 2 : attackType.equals("fire") ? getAttackPower() * 3 : getAttackPower();
    }

    // @Override
    // public void printAttack(Character character) {
    //     System.out.println(String.format("%s deals %d damage", character.getName(), character.attack()));
    // }
    
}
