import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class PostDBConn
{
    public static void main(String[] args) {

            try {

                String sql = "select name from student where id=2";

                String url = "jdbc:postgresql://localhost:5432/postgres";
                String username = "postgres";
                String password = "admin";

                Connection con = DriverManager.getConnection(url, username, password);

                Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                String name = rs.getString(1);
                System.out.println(name);

            }
            catch (SQLException ex)
            {
                System.out.println("Error in Connection...!!!"+ex.getMessage());
            }

    }
}
