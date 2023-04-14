package No2;

public class Koordinator extends Programmer {
    private String division;

    public Koordinator(String name, String gender, int age, String division) {
        super(name, gender, age);
        setDivision(division);
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Divisi: " + getDivision());
    }

    public void doTask() {
        System.out.printf("%s mengerjakan tugas sebagai %s... \n", getName(), getDivision());
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
