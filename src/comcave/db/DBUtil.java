package biblio.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static ConnectionManager instance = null;

    private static final String M_USERNAME = "dbuser";
    private static final String M_PASSWORD = "dbpassword";
    private static final String M_CONN_STRING = "jdbc:masql//192.168.0.206/explorecalifornia";
    private static final String H_USERNAME = "sa";
    private static final String H_PASSWORD = "";
    private static final String H_CONN_STRING = "jdbc:h2:~/test";

    public static Connection getConnection(DBType dbType) throws SQLException {
        switch (dbType) {
            case MySQL:
                return DriverManager.getConnection(M_CONN_STRING, M_USERNAME, M_PASSWORD);
            case H2:
                return DriverManager.getConnection(H_CONN_STRING, H_USERNAME, H_PASSWORD);

            default:
                return null;
        }
    }
    public static void processException(SQLException e){
        System.err.println("Error message: " + e.getMessage());
        System.err.println("Error code" + e.getErrorCode());
        System.err.println("SQL state: " + e.getSQLState());
    }
}
