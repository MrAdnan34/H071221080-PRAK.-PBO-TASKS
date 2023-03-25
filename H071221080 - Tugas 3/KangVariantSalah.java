class KangVariantSalah {
    String name;
    int universe, troops, power, health;
    boolean isHero;

    public KangVariantSalah() {}

    public KangVariantSalah(String name, int universe) {
        this.name = name;
        this.universe = universe;
        // this.power = 50;
        // this.health = 100;
        // this.troops = 10;
        // this.isHero = false;
    }
    
    public KangVariantSalah(String name, int universe, int troops) {
        this.name = name;
        this.universe = universe;
        this.troops = troops;
    }

    public KangVariantSalah(String name, int universe, int troops, boolean isHero) {
        this.name = name;
        this.universe = universe;
        this.troops = troops;
        this.isHero = isHero;
    }

    public KangVariantSalah(String name, int universe, int troops, boolean isHero, int power, int health) {
        this.name = name;
        this.universe = universe;
        this.troops = troops;
        this.isHero = isHero;
        this.power = power;
        this.health = health;
    }

    public void checkStatus() {
        System.out.println("===== Kang's Status =====");
        System.out.println("Name                : " + this.getName());
        System.out.println("At Universe         : " + this.getUniverse());
        System.out.println("Amount of Troops    : " + this.getTroops());
        System.out.println("Role                : " + this.getRole());
        System.out.println("Power               : " + this.getPower());
        System.out.println("Health              : " + this.getHealth());
    }

    public void summonTroops(int troops) {
        this.troops += troops;
        System.out.printf("Add %d troops \n", troops);
    }

    public void travelToUniverse(int universe) {
        this.universe = universe;
        System.out.printf("%s is moving to Universe-%d \n", this.getName(), universe);
    }

    public void launchBattleTo(KangVariantSalah enemy) {
        if (this.universe == enemy.universe) {
            enemy.health -= this.getPower();
            
            System.out.printf("%s launch attack to %s... \n", this.getName(), enemy.getName());
            
            if (enemy.health <= 0) {
                System.out.printf("%s has lost \n", enemy.getName());
            }
        } else {
            System.out.printf("%s and %s are in a different universes. Can't launch attack \n", this.getName(), enemy.getName());
        }
    }
    
    public void launchWarTo(KangVariantSalah enemy) {
        if (this.universe == enemy.universe) {
            enemy.health -= this.getPower();
            this.health -= enemy.getPower();

            enemy.troops -= this.getTroops();
            this.troops -= enemy.getTroops();
            
            System.out.printf("%s's troops and %s's troops are at war \n", this.getName(), enemy.getName());
        } else {
            enemy.troops -= this.getTroops();
            this.troops -= enemy.getTroops();
            
            // System.out.printf("%s's troops and %s's troops are at war", this.getName(), enemy.getName());
            System.out.printf("%s and %s are in a different universes. Only their troops are at war \n", this.getName(), enemy.getName());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniverse(int universe) {
        this.universe = universe;
    }

    public void setTroops(int troops) {
        this.troops = troops;
    }

    public void setRole(String role) {
        if (role.equalsIgnoreCase("Hero") || role.equalsIgnoreCase("Anti Hero")) {
            this.isHero = true;
        } else {
            this.isHero = false;
        }
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getUniverse() {
        return this.universe;
    }

    public int getTroops() {
        return this.troops;
    }

    public String getRole() {
        return this.isHero ? "Anti Hero" : "Villain";
    }

    public int getPower() {
        return this.power;
    }

    public int getHealth() {
        // return this.health;
        return this.health > 0 ? this.health : 0;
    }
}
