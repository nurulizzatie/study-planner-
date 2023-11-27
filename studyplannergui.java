package studyplannertest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signin {

    private JFrame frame;
    private JPanel cards;
    private CardLayout cardLayout;
    private JTextField textFieldemailorphone;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    signin window = new signin();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public signin() {
        initialize();
    }

    private JPanel createPage(String pageName) {
        JPanel pagePanel = new JPanel();
        pagePanel.setLayout(null);
        pagePanel.setBackground(new Color(204, 255, 204)); // Light green background

        JLabel lblTitle = new JLabel(pageName);
        lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblTitle.setBounds(51, 24, 297, 46);
        pagePanel.add(lblTitle);

        JButton backButton = new JButton("Back to Dashboard");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "studyPlanner"); // Switch back to Study Planner Dashboard
            }
        });
        backButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        backButton.setBounds(35, 476, 180, 30);
        pagePanel.add(backButton);
        ImageIcon icon = new ImageIcon("C:\\Users\\Nurul Izzatie\\eclipse-workspace\\StudyPlanner\\mint.jpg");
        return pagePanel;
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 400, 591);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cards = new JPanel();
        cardLayout = new CardLayout();
        cards.setLayout(cardLayout);

        JPanel signInPanel = createSignInPanel();
        signInPanel.setBackground(new Color(102, 204, 255)); // Blue background

        JPanel studyPlannerPanel = createStudyPlannerPanel();

        JPanel profilePanel = createProfilePanel();
        profilePanel.setBackground(new Color(255, 229, 204)); // Light brown background

        JPanel timetablePanel = createTimetablePanel();
        timetablePanel.setBackground(new Color(255, 204, 255)); // Pink background

        JPanel subjectsPanel = createSubjectsPanel();
        subjectsPanel.setBackground(new Color(204, 153, 255)); // Purple background

        JPanel calendarPanel = createCalendarPanel();
        calendarPanel.setBackground(new Color(204, 229, 255)); // Light blue background

        cards.add(signInPanel, "signIn");
        cards.add(studyPlannerPanel, "studyPlanner");
        cards.add(profilePanel, "profile");
        cards.add(timetablePanel, "timetable");
        cards.add(subjectsPanel, "subjects");
        cards.add(calendarPanel, "calendar");

        frame.getContentPane().add(cards);
    }

    private JPanel createSignInPanel() {
        JPanel signInPanel = new JPanel();
        signInPanel.setLayout(null);

        JLabel lblsignin = new JLabel("Sign in");
        lblsignin.setForeground(new Color(255, 0, 128));
        lblsignin.setBackground(new Color(255, 255, 255));
        lblsignin.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblsignin.setBounds(43, 69, 109, 51);
        signInPanel.add(lblsignin);

        JButton btnsignin = new JButton("Sign in");
        btnsignin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Replace this condition with your actual authentication logic
                boolean authenticated = true; // Sample authentication
                if (authenticated) {
                    cardLayout.show(cards, "studyPlanner"); // Switch to the study planner page
                } else {
                    // Show an error message if authentication fails
                    System.out.println("Authentication failed. Please try again.");
                }
            }
        });
        btnsignin.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnsignin.setBounds(122, 302, 97, 32);
        btnsignin.setBackground(new Color(128, 0, 128)); // Blue button
        signInPanel.add(btnsignin);
        
        JLabel lblNewLabel = new JLabel("Stay updated with your Study Planner");
        lblNewLabel.setForeground(new Color(255, 0, 128));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setBounds(43, 114, 304, 19);
        signInPanel.add(lblNewLabel);
        
        textFieldemailorphone = new JTextField();
        textFieldemailorphone.setBounds(43, 166, 250, 32);
        signInPanel.add(textFieldemailorphone);
        textFieldemailorphone.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(43, 234, 250, 32);
        signInPanel.add(passwordField);
        
        JLabel lblemailorphone = new JLabel("Email or Phone");
        lblemailorphone.setForeground(new Color(255, 0, 128));
        lblemailorphone.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblemailorphone.setBounds(43, 153, 109, 13);
        signInPanel.add(lblemailorphone);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setForeground(new Color(255, 0, 128));
        lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblpassword.setBounds(43, 219, 91, 13);
        signInPanel.add(lblpassword);

        return signInPanel;
    }

    private JPanel createStudyPlannerPanel() {
        JPanel studyPlannerPanel = new JPanel();
        studyPlannerPanel.setBackground(new Color(255, 128, 255));
        studyPlannerPanel.setLayout(null);

        JLabel lblStudyPlanner = new JLabel("Study Planner Dashboard");
        lblStudyPlanner.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblStudyPlanner.setBounds(51, 24, 297, 46);
        studyPlannerPanel.add(lblStudyPlanner);

        JButton btnProfile = new JButton("Profile");
        btnProfile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "profile");
            }
        });
        btnProfile.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnProfile.setBounds(38, 133, 115, 80);
        studyPlannerPanel.add(btnProfile);

        JButton btnTimetable = new JButton("Timetable");
        btnTimetable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "timetable");
            }
        });
        btnTimetable.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnTimetable.setBounds(38, 243, 115, 80);
        studyPlannerPanel.add(btnTimetable);

        JButton btnSubjects = new JButton("Subjects");
        btnSubjects.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "subjects");
            }
        });
        btnSubjects.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSubjects.setBounds(216, 133, 115, 80);
        studyPlannerPanel.add(btnSubjects);

        JButton btnCalendar = new JButton("Calendar");
        btnCalendar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "calendar");
            }
        });
        btnCalendar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnCalendar.setBounds(216, 243, 115, 80);
        studyPlannerPanel.add(btnCalendar);
        
        JButton btnlogout = new JButton("Log out");
        btnlogout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Log Out Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmed == JOptionPane.YES_OPTION) {
                    System.exit(0); 
        	}
        }
        	});
        btnlogout.setBackground(new Color(128, 0, 128));
        btnlogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnlogout.setBounds(147, 508, 85, 21);
        studyPlannerPanel.add(btnlogout);

        return studyPlannerPanel;
    }

    private JPanel createProfilePanel() {
        JPanel profilePanel = createPage("Profile Page");
        profilePanel.setBackground(new Color(210, 180, 140)); // Light brown background for profile

        JLabel lblProfileInfo = new JLabel("");
        lblProfileInfo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblProfileInfo.setBounds(100, 20, 250, 30);
        profilePanel.add(lblProfileInfo);

        JLabel nameLabel = new JLabel("Name: Kemos");
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        nameLabel.setBounds(50, 70, 300, 20);
        profilePanel.add(nameLabel);

        JLabel dobLabel = new JLabel("Date of Birth: 10.01.2005");
        dobLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        dobLabel.setBounds(50, 100, 300, 20);
        profilePanel.add(dobLabel);

        JLabel emailLabel = new JLabel("Email Address: kemos@gmail.com");
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        emailLabel.setBounds(50, 130, 300, 20);
        profilePanel.add(emailLabel);

        // Profile picture
        ImageIcon profileImage = new ImageIcon("C:\\Users\\Nurul Izzatie\\eclipse-workspace\\StudyPlanner\\cat.jpg");
        JLabel picLabel = new JLabel(profileImage);
        picLabel.setBounds(200, 170, 152, 150);
        profilePanel.add(picLabel);

        
        return profilePanel;
    }

    private JPanel createTimetablePanel() {
        JPanel timetablePanel = createPage("Timetable Page");
        timetablePanel.setBackground(new Color(255, 204, 255)); // Pink background for timetable

        JLabel lblTimetable = new JLabel("");
        lblTimetable.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTimetable.setBounds(150, 20, 200, 30);
        timetablePanel.add(lblTimetable);

        // Creating a timetable grid using JTextArea
        JTextArea timetableArea = new JTextArea();
        timetableArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        timetableArea.setEditable(false);
        timetableArea.setMargin(new Insets(10, 10, 10, 10));
        timetableArea.setText("Timetable for Subjects:\n\n" +
                "Physics: Monday 9-11 am\n" +
                "Biology: Tuesday 10 am-12 pm\n" +
                "Chemistry: Wednesday 1-3 pm\n" +
                "Mathematics: Thursday 11 am-1 pm\n" +
                "Additional Mathematics: Friday 2-4 pm\n");
        
        JScrollPane scrollPane = new JScrollPane(timetableArea);
        scrollPane.setBounds(40, 60, 300, 300);
        timetablePanel.add(scrollPane);

        return timetablePanel;
    }

    private JPanel createSubjectsPanel() {
        JPanel subjectsPanel = createPage("Subjects Page");
        subjectsPanel.setBackground(new Color(204, 153, 255)); // Purple background for subjects

        JLabel lblSubjects = new JLabel("");
        lblSubjects.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSubjects.setBounds(150, 20, 200, 30);
        subjectsPanel.add(lblSubjects);

        JTextArea subjectsArea = new JTextArea();
        subjectsArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        subjectsArea.setEditable(false);
        subjectsArea.setMargin(new Insets(10, 10, 10, 10));
        subjectsArea.setText("Study Schedule:\n\n" +
                "Biology: Monday and Wednesday, 9-11 am\n" +
                "Chemistry: Tuesday and Thursday, 10 am-12 pm\n" +
                "Physics: Tuesday and Friday, 2-4 pm\n" +
                "Mathematics: Monday, Wednesday, and Friday, 1-3 pm\n" +
                "Additional Mathematics: Thursday, 3-5 pm\n");
        
        JScrollPane scrollPane = new JScrollPane(subjectsArea);
        scrollPane.setBounds(40, 60, 300, 300);
        subjectsPanel.add(scrollPane);
        return subjectsPanel;
    }

    private JPanel createCalendarPanel() {
        JPanel calendarPanel = createPage("Calendar Page");
        calendarPanel.setBackground(new Color(153, 204, 255)); // Light blue background for calendar

        JLabel lblCalendar = new JLabel("");
        lblCalendar.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCalendar.setBounds(150, 20, 200, 30);
        calendarPanel.add(lblCalendar);

        JTextArea assignmentsArea = new JTextArea();
        assignmentsArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        assignmentsArea.setEditable(false);
        assignmentsArea.setMargin(new Insets(10, 10, 10, 10));
        assignmentsArea.setText("Assignments Due:\n" +
                "- Physics assignment due on Friday\n" +
                "- Chemistry lab report due on Wednesday\n\n");
        JScrollPane assignmentsScrollPane = new JScrollPane(assignmentsArea);
        assignmentsScrollPane.setBounds(40, 60, 300, 100);
        calendarPanel.add(assignmentsScrollPane);

        JTextArea quizzesArea = new JTextArea();
        quizzesArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        quizzesArea.setEditable(false);
        quizzesArea.setMargin(new Insets(10, 10, 10, 10));
        quizzesArea.setText("Quizzes/Tests:\n" +
                "- Math quiz on Monday\n" +
                "- Biology test on Thursday\n\n");
        JScrollPane quizzesScrollPane = new JScrollPane(quizzesArea);
        quizzesScrollPane.setBounds(40, 170, 300, 100);
        calendarPanel.add(quizzesScrollPane);

        JTextArea eventsArea = new JTextArea();
        eventsArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        eventsArea.setEditable(false);
        eventsArea.setMargin(new Insets(10, 10, 10, 10));
        eventsArea.setText("Social Events:\n" +
                "- Club meeting on Wednesday at 3 pm\n" +
                "- Science fair on Saturday\n\n");
        JScrollPane eventsScrollPane = new JScrollPane(eventsArea);
        eventsScrollPane.setBounds(40, 280, 300, 100);
        calendarPanel.add(eventsScrollPane);
        return calendarPanel;
    }
}
