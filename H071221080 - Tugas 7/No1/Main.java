package No1;

public class Main {
    public static void main(String[] args) {
        Character[] characters = new Character[5];

        characters[0] = new Fighter("Yu Zhong", 80);
        characters[1] = new Mage("Harith", 75);
        characters[2] = new Fighter("Thamuz", 75);
        characters[3] = new Fighter("Leomord", 70);
        characters[4] = new Mage("Cecilion", 85);

        for (Character character : characters) {
            character.printAttack(character);
        }

        // Fighter fighter1 = new Fighter("Yu Zhong", 80);
        // Fighter fighter2 = new Fighter("Thamuz", 75);
        // Fighter fighter3 = new Fighter("Leomord", 70);

        // Mage mage1 = new Mage("Harith", 75);
        // Mage mage2 = new Mage("Cecilion", 85);
    }
}
