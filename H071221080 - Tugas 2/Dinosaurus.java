public class Dinosaurus {
    // Attribute class
    String name, classification;
    int feet;
    boolean isCarnivore, isHerbivore;

    // main method
    public static void main(String[] args) {
        // Memanggil class untuk membuat objek
        Dinosaurus dino = new Dinosaurus();
        // Mendeklarasikan atribut untuk objek dino
        dino.name = "Tyrannosaurus Rex";
        dino.classification = "Theropods";
        dino.feet = 2;
        dino.isCarnivore = true;
        dino.isHerbivore = false;

        System.out.println(dino.name);
        System.out.println(dino.classification);
        System.out.println(dino.feet);
        // Memanggil behavior method dino
        dino.dinoFoodType();
        dino.dinoVoice();
        dino.dinoAction();
        dino.dinoFly();
        // dinoRoar();

        System.out.println();

        Dinosaurus dino2 = new Dinosaurus();
        dino2.name = "Pteranodon";
        dino2.classification = "Pterosaurus";
        dino2.feet = 2;
        dino2.isCarnivore = true;
        dino2.isHerbivore = false;

        System.out.println(dino2.name);
        System.out.println(dino2.classification);
        System.out.println(dino2.feet);
        dino2.dinoFoodType();
        dino2.dinoVoice();
        dino2.dinoAction();
        dino2.dinoFly();
    }

    // Behavior method class
    public void dinoFoodType() {
        System.out.println(isCarnivore && isHerbivore ? this.name + " is Omnivore" : isCarnivore ? this.name + " is Carnivore" : isHerbivore ? this.name + " is Herbivore" : this.name + " is Not Identified");
    }

    public void dinoVoice() {
        System.out.println(this.isCarnivore ? this.name + ": ROARRR" : this.name + ": MMMMMMM");
    }

    public void dinoAction() {
        if (this.isCarnivore) {
            System.out.printf("%s is hunting \n", this.name);
        } else {
            System.out.printf("%s being hunted \n", this.name);
        }
    }

    public void dinoFly() {
        if (this.classification.equalsIgnoreCase("Pterosaurus")) {
            System.out.printf("%s is flying \n", this.name);
        } else {
            System.out.printf("%s can't fly \n", this.name);
        }
    }
}
