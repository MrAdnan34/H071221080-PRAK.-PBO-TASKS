package No1;

public abstract class Character {
    protected String name;
    protected int attackPower;

    protected Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public abstract int attack();

    public abstract int attack(String attackType);

    public void printAttack(Character character) {
        System.out.println(String.format("%s deals %d damage", character.getName(), character.attack()));
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }
}
