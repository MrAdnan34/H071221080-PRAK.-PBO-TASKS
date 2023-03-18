public class Person {
    // Attribute class
    String name;
    int age;
    boolean isMale;

    public static void main(String[] args) {
        // Memanggil class untuk membuat objek
        Person person = new Person();

        person.setName("Manusia");
        person.setAge(18);
        person.setGender("fEmAle");

        String personName = person.getName();
        int personAge = person.getAge();
        String personIsMale = person.getGender();

        System.out.println(personName);
        System.out.println(personAge);
        System.out.println(personIsMale);
    }

    // Behavior method class
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            this.isMale = true;
        } else {
            this.isMale = false;
        }
    }

    public String getGender() {
        if (this.isMale) {
            return "Male";
        } else {
            return "Female";
        }
    }
}
