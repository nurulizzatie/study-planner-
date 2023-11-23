import java.util.Date;
public class StudyEntry {
    private String subject;
    private String time;
    private String date;

    public StudyEntry(String subject, String time, String date) {
        this.subject = subject;
        this.time = time;
        this.date = date;
    }

    // Getters and setters for subject, time, and date

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
