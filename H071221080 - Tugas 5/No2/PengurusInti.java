package No2;

public class PengurusInti extends Programmer {
    private String position;

    public PengurusInti(String name, String gender, int age, String position) {
        super(name, gender, age);
        setPosition(position);
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Jabatan: " + getPosition());
    }

    public void addMember(int totalMember) {
        System.out.println(getName() + " menambah " + totalMember + " anggota...");
    }

    public void deleteMember(String memberName) {
        System.out.printf("%s menghapus %s...", getName(), memberName);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
