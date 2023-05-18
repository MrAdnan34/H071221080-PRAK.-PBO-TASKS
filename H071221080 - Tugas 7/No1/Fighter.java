package No1;

public class Fighter extends Character {

    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    public int attack() {
        return getAttackPower();
    }

    @Override
    public int attack(String attackType) {
        return attackType.equals("melee") ? getAttackPower() * 2 : getAttackPower() ;
    }

    // @Override
    // public void printAttack(Character character) {
    //     System.out.println(String.format("%s deals %d damage", character.getName(), character.attack()));
    // }
    
}
