//____Without_Try_and _catch___________
import java.sql.*;
import javax.swing.JOptionPane;
public class ThrowExceptionHandling_Database{
    static Connection con;
    static void connect(String url,String user,String pass ,String database) throws SQLException{
        con = DriverManager.getConnection(url + database,user,pass);
    }
    public static void main(String[] sri) throws SQLException{
        connect("jdbc:mysql://localhost:3306/","root","1111","newdatabase");
        if(con != null){
            System.out.println("Successfully Connected");
        }
    }
}

// ==> Compilation=javac -cp "C:\Users\Srinivas Sri\Desktop\Frames_Java\Connector_SQL" ThrowExceptionHandling_Database.java



// import java.sql.*;
// import javax.swing.JOptionPane;
// public class ThrowExceptionHandling_Database{
//     static Connection con;
//     static void connect(String url,String user,String pass ,String database) throws SQLException{
//         con = DriverManager.getConnection(url + database,user,pass);
//     }
//     public static void main(String[] sri) {
//         try{
//             connect("jdbc:mysql://localhost:3306/","root","1111","newdatabase");
//             if(con != null){
//                 System.out.println("Successfully Connected");
//             }
//         }
//         catch(SQLException e){
//             JOptionPane.showMessageDialog(null,e.getMessage(),"Ooops!!",JOptionPane.ERROR_MESSAGE);
//         }
//     }
// }