import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

//Class to Print text when button is clicked
// class DoSomething implements ActionListener{
//     public void actionPerformed(ActionEvent e){
//         System.out.println("You Clicked me");
//     }
// }

public class Frames1{
    public static void main(String[] sri){
        //An object of Jframe class
        JFrame window = new JFrame();
        window.setTitle("My 1st Frame"); //To SEt Title or Set Inside new JFrame("Title");
        window.setSize(1920,1080); //Used to set the size of the window 
        window.setVisible(true); // makes window visible 
        // window.setResizable(false); //Restrict user from resizing the window size
        // Label --> JLabel --> swing
        // An object of JLabel clas
        window.setLayout(null); 
        
        //JLabel
        JLabel lbl = new JLabel();
        lbl.setText("This is my First Java GUI Program...");
        lbl.setBounds(100,10,400,20); //        Have to set Layout null to wotk this
        Font myFont = new Font("MV Boli",Font.ITALIC,20);
        lbl.setFont(myFont);
        // lbl.setForeground(Color.red); 
        // window.getContentPane().setBackground(Color.blue);

        //JButton
        JButton button = new JButton();
        button.setText("Tap Here");
        button.setBounds(100,30,120,70); // X+Width = horizental starting point and vice versa
        // button.addActionListener(new DoSomething());

        // JTextfield
        JTextField tfi = new JTextField();
        tfi.setFont(new Font("MV Boli",Font.BOLD,20));
        tfi.setBounds(230,30,150,80);
        // ActionsListner to take input
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String inputString = tfi.getText();
                System.out.println("Hello"+ inputString);
                tfi.setText(" "); //To keep text bar empty when it's printed
            }
        });
        window.add(lbl);//Adds the Label to Window
        window.add(button); //Adds the Button to Window
        window.add(tfi);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}