import java.sql.*;
public class DbConnection{
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
                } 
                catch(SQLException e){
                    System.out.println(e);
                }
		}
}