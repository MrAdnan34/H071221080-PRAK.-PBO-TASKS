package login_app.models;

public class Profile {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */

    // ATTRIBUTE
    private String fullName, hobby, nickName;
    private int age;

    // CONSTRUCTOR
    public Profile() {}

    public Profile(String fullName, int age, String hobby) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
    }
    
    public Profile(String fullName, int age, String hobby, String nickName) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = nickName;
    }

    // METHOD
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
