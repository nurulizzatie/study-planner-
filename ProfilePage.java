public class ProfilePage {
    public void showProfilePage(User user) {
        System.out.println("\nProfile Information:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Age: " + user.getAge());
        System.out.println("Class: " + user.getUserClass());
    }
}
