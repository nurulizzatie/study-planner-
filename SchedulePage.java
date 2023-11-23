import java.util.List;

public class SchedulePage {
    public void showSchedulePage(List<StudyEntry> studyEntries) {
        System.out.println("\nSchedule:");

        for (StudyEntry entry : studyEntries) {
            // Implement logic to display alarms and timestamps for study entries
            // This can include reminders based on date and time
            System.out.println("Alarm for Subject '" + entry.getSubject() + "' at " + entry.getTime());
        }
    }
}
