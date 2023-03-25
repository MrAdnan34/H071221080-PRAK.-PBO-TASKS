public class KaijuMonster {
    String name;
    int power, health;
    boolean isVillain;

    public String getName() {
        return this.name;
    }

    public int getPower() {
        return this.power;
    }

    public int getHealth() {
        return this.health;
    }

    public String getRole() {
        return this.isVillain ? "Villain" : "Hero";
    }

    public void monsterRoar() {
        System.out.println(this.isVillain ? "ROARRR" : "HAAAAA");
    }

    public void callHelp(int helper) {
        if (this.isVillain) {

            System.out.printf("%s get %d help \n", this.name, helper);
        } else {
            System.out.println("Villain can't get help");
        }
    }

    public void launchAttackTo(KaijuMonster enemy) {
        enemy.health -= this.getPower();

        if (enemy.health <= 0) {
            System.out.printf("%s has lost", enemy.getName());
        } else {
            System.out.printf("%s has been attacked", enemy.getName());
        }
    }
}
