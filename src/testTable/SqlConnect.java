package testTable;

/**
 *
 * @author evazaf
 */
import java.sql.*;
import javax.swing.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
public class SqlConnect {
  //  Connection con;//= null ;//= null;
    public static Connection ConnectDB(){
        try{
            //JDBC= class   ,org.sqlite= package
            //Class.forName loads the class if it not already loaded.
            Class.forName("org.sqlite.JDBC");
            //Connection con=DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/users.sqlite");
            
            
            //getConnection=Attempts to establish a connection to the given database URL. //test.sqlite
            Connection con=DriverManager.getConnection("jdbc:sqlite:E:/one/riksmarl.sqlite");//το path που βρίσκεται το αρχείο της βάσης users.sqlite
            //Connection con=DriverManager.getConnection("jdbc:sqlite:‪‪C:\\Users\\evazaf\\Desktop\\users.sqlite");
            JOptionPane.showMessageDialog(null, "Connected to Database");//επιτυχης συνδεση στη βαση
            
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
