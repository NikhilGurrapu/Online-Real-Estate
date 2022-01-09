package common;
import java.sql.*;
public class MyConnection {
    public static Connection connectTo(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ores","root","");
            if (conn != null)
            {
                return conn;
            }
            else
            {
                System.err.println("connected unsuccessfully");
            }
        }
        catch(ClassNotFoundException ce)
        {
            System.err.println(ce.getMessage());
        }
        catch(SQLException e){
        }
        return null;
    }
    public static void main(String[] args){
        MyConnection.connectTo();
    }
}
