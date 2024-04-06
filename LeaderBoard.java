import java.awt.*;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextArea;
import java.util.List;
import java.util.ArrayList;

public class LeaderBoard{
    static String college = "";
    static DatabaseConnection dbConnection;
    static JTextArea outputArea;

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/javatask";
            String user = "root";
            String pass = "1111";
            Connection con = DriverManager.getConnection(url, user, pass);
            if (con != null)
                System.out.println("Successfully Connected");

            dbConnection = new DatabaseConnection(con);

            JFrame mainFrame = new JFrame("LeaderBoard");
            mainFrame.setSize(700, 600);
            mainFrame.setResizable(false);
            mainFrame.setLayout(null);

            JLabel tagLine = new JLabel("Top 10 in Codemind");
            tagLine.setBounds(150, 20, 500, 40);
            tagLine.setFont(new Font("Berlin Sans FB", Font.BOLD, 40));

            JButton aecButton, acetButton, acoeButton, allButton;
            aecButton = new JButton("AEC");
            acetButton = new JButton("ACET");
            acoeButton = new JButton("ACOE");
            allButton = new JButton("ALL");
            aecButton.setBounds(70, 100, 100, 40);
            acetButton.setBounds(210, 100, 100, 40);
            acoeButton.setBounds(350, 100, 100, 40);
            allButton.setBounds(490, 100, 100, 40);

            outputArea = new JTextArea(""); // Initialize outputArea here
            outputArea.setBounds(70, 200, 520, 300);
            outputArea.setBackground(Color.LIGHT_GRAY);
            //outputArea.setSize(520,300);

            class ButtonClickListener implements ActionListener {
                public void actionPerformed(ActionEvent button) {
                    if (button.getSource() == aecButton) {
                        college = "AEC";
                    } else if (button.getSource() == acetButton) {
                        college = "ACET";
                    } else if (button.getSource() == acoeButton) {
                        college = "ACOE";
                    }
                    displayLeaderboard(college);
                }
            }

            aecButton.addActionListener(new ButtonClickListener());
            acetButton.addActionListener(new ButtonClickListener());
            acoeButton.addActionListener(new ButtonClickListener());
            allButton.addActionListener(new ButtonClickListener());

            mainFrame.add(aecButton);
            mainFrame.add(acetButton);
            mainFrame.add(acoeButton);
            mainFrame.add(allButton);
            mainFrame.add(tagLine);
            mainFrame.add(outputArea);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setVisible(true);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private static void displayLeaderboard(String college) {
        String leaderboard = "Top 10 Students from " + college + ":\n";
        List<Student> students = dbConnection.getTopStudents(college);
        for (int i = 0; i < students.size(); i++) {
            leaderboard +="Id - "+students.get(i).getId()+ ", "+"Branch - "+students.get(i).getBranch()+", "+"Age - "+students.get(i).getAge()+"--->"+ students.get(i).getName() + " - " + students.get(i).getCodemind() +"\n";
        }
        outputArea.setText(leaderboard);
    }

}

class DatabaseConnection {
    private Connection connection;

    public DatabaseConnection(Connection con) {
        this.connection = con;
    }

    public List<Student> getTopStudents(String college) {
        List<Student> students = new ArrayList<>();
        try {
            String query = "SELECT * FROM CODEMIND WHERE college = ? ORDER BY codemind DESC LIMIT 10";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, college);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String branch = resultSet.getString("branch");
                int age = resultSet.getInt("age");
                int codemind = resultSet.getInt("codemind");
                students.add(new Student(id, name, college, branch, age, codemind));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return students;
    }
}

class Student {
    private int id;
    private String name;
    private String college;
    private String branch;
    private int age;
    private int codemind;

    public Student(int id, String name, String college, String branch, int age, int codemind) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.branch = branch;
        this.age = age;
        this.codemind = codemind;
    }

    public String getName() {
        return name;
    }

    public int getCodemind() {
        return codemind;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getBranch(){
        return branch;
    }
}