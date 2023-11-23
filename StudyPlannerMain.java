import java.util.Scanner;

public class StudyPlannerMain {
    public static void main(String[] args) {
        // Create an instance of the login page
        LoginPage loginPage = new LoginPage();

        // Get user input for login
        User user = loginPage.showLoginPage();

        // Get user input for study entries
        StudyEntryManager entryManager = new StudyEntryManager();
        entryManager.collectStudyEntries();

        // Display menu for options
        displayMenu(user, entryManager);
    }

    private static void displayMenu(User user, StudyEntryManager entryManager) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Profile");
            System.out.println("2. Timetable");
            System.out.println("3. Schedule");
            System.out.println("4. Statistics");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new ProfilePage().showProfilePage(user);
                    break;
                case 2:
                    new TimetablePage().showTimetablePage(entryManager.getStudyEntries());
                    break;
                case 3:
                    new SchedulePage().showSchedulePage(entryManager.getStudyEntries());
                    break;
                case 4:
                    new StatsPage().showStatsPage();
                    break;
                case 0:
                    System.out.println("Exiting Study Planner. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
