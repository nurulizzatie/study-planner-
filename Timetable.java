import java.util.List;

public class TimetablePage {
    public void showTimetablePage(List<StudyEntry> studyEntries) {
        System.out.println("\nTimetable:");

        for (StudyEntry entry : studyEntries) {
            System.out.println("Subject: " + entry.getSubject());
            System.out.println("Time: " + entry.getTime());
            System.out.println("Date: " + entry.getDate());
            System.out.println("------------");
        }
    }
}
