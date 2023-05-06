/** Name: Miguelito Jean
 * Class : CSC205
 */


import java.sql.Connection;
import java.sql.DriverManager; import java.sql.SQLException;

public class SQLiteTest {

    public static void main(String args[]) {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        Connection conn = null;
        try {
                conn = DriverManager.getConnection("jdbc:sqlite:csc205.db");
                System.out.println("Opened database connection!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}


