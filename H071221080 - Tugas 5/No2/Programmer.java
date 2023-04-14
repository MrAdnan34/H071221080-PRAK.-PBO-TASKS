package No2;

public class Programmer {
    protected String name, gender;
    protected int age;

    protected Programmer(String name, String gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    protected void showData() {
        System.out.println("Nama: " + getName());
        System.out.println("Jenis kelamin: " + getGender());
        System.out.println("Umur: " + getAge() + " tahun");
    }

    protected String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }

    protected String getGender() {
        return gender;
    }
    protected void setGender(String gender) {
        this.gender = gender;
    }

    protected int getAge() {
        return age;
    }
    protected void setAge(int age) {
        this.age = age;
    }
}
