public class User {
    private String username;
    private String password;
    private int age;
    private String userClass;

    public User(String username, String password, int age, String userClass) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.userClass = userClass;
    }

    // Getters and setters for username, password, age, and userClass

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }
}
