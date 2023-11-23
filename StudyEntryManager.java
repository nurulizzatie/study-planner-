import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudyEntryManager {
    private List<StudyEntry> studyEntries;

    public StudyEntryManager() {
        this.studyEntries = new ArrayList<>();
    }

    public void collectStudyEntries() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your study entries. Type 'done' to finish.");

        while (true) {
            System.out.print("Subject: ");
            String subject = scanner.nextLine();

            if (subject.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Time: ");
            String time = scanner.nextLine();

            System.out.print("Date: ");
            String date = scanner.nextLine();

            StudyEntry entry = new StudyEntry(subject, time, date);
            studyEntries.add(entry);
        }
    }

    public List<StudyEntry> getStudyEntries() {
        return studyEntries;
    }
}
