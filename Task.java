import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Task{
    public static void main(String[] sri) {
            //1.REgestring the driver //2.Connectionnf to the database
            //1.Url 2. username 3.password 
            try{
                String url = "Jdbc:mysql://localhost:3306/newdatabase";
                String root = "root";
                String pass= "1111";
                Connection conn = DriverManager.getConnection(url, root, pass);
                if(conn!=null){
                    System.out.println("Successfully Connected");
                }
                ///
                

                JFrame frame = new JFrame("fda");
                frame.setVisible(true);
                frame.setResizable(true);
                frame.setBounds(20,10,1920,1080);
                frame.setLayout(null);
        
        
                JLabel lbl1 = new JLabel();
                lbl1.setText("Tables in NewDatabases");
                lbl1.setBounds(20,20,250,50);
                lbl1.setFont(new Font("MV Boli",Font.ITALIC,20));
                lbl1.setOpaque(true);
    
                JComboBox dropBox = new JComboBox<>();
                dropBox.setBounds(25,80,150,50);

                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("show tables in newdatabase"); // Query to get all table names

                while(rs.next()){
                    dropBox.addItem(rs.getString(1));
                }
                frame.add(lbl1);
                frame.add(dropBox);

            }
            catch(SQLException e){
                System.out.println(e);
            }

    }
}