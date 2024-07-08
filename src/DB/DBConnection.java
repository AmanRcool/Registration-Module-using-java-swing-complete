
package DB;
import java.sql.*;

public class DBConnection {
    public Connection con;
    public PreparedStatement pstmt;
    public ResultSet rst;
    public Statement stmt;
    
    public DBConnection()
    {
        try{
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
