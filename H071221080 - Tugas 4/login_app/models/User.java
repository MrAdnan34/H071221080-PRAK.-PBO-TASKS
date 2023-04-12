package login_app.models;

public class User {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */

    // ATTRIBUTE
    private String username, password;

    // CONSTRUCTOR
    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // METHOD
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
