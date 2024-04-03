import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

//Class to Print text when button is clicked
// class DoSomething implements ActionListener{
//     public void actionPerformed(ActionEvent e){
//         System.out.println("You Clicked me");
//     }
// }

public class Jscroll{
    public static void main(String[] sri){
        //An object of Jframe class
        JFrame window = new JFrame();
        window.setTitle("My 1st Frame"); //To SEt Title or Set Inside new JFrame("Title");
        window.setSize(1000,600); //Used to set the size of the window 
        window.setVisible(true); // makes window visible 
        // window.setResizable(false); //Restrict user from resizing the window size
        // Label --> JLabel --> swing
        // An object of JLabel clas
        window.setLayout(null); 
        
        // lbl.setForeground(Color.red); 
        // window.getContentPane().setBackground(Color.blue);

        //
        JScrollPane pane = new JScrollPane();
        pane.setBounds(50,50,800,400); 

        JTextArea area = new JTextArea()
        area.setFont(new Font("Cascandia code",Font.BOLD,20));
        area.setText("This is a panekj."reapeat(50));
        pane.setViewPortView(area);


     
        window.add(lbl);//Adds the Label to Window
        window.add(button); //Adds the Button to Window
        window.add(tfi);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}