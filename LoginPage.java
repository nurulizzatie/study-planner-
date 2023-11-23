import java.util.Scanner;

public class LoginPage {
    public User showLoginPage() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter your class: ");
        String userClass = scanner.nextLine();

        // Create and return a new User object
        return new User(username, password, age, userClass);
    }
}
