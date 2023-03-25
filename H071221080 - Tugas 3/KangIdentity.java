public class KangIdentity {
    String weapon;
    int universe;

    KangIdentity() {}

    KangIdentity(String weapon, int universe) {
        this.weapon = weapon;
        this.universe = universe;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setUniverse(int universe) {
        this.universe = universe;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public int getUniverse() {
        return this.universe;
    }
}
