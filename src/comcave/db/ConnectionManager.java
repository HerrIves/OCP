package biblio.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static ConnectionManager instance = null;

    private final String M_USERNAME = "dbuser";
    private final String M_PASSWORD = "dbpassword";
    private final String M_CONN_STRING = "jdbc:mysql//192.168.0.206:3306/explorecalifornia";
    private static final String H_USERNAME = "sa";
    private static final String H_PASSWORD = "";
    private static final String H_CONN_STRING = "jdbc:h2:~/test";

    private DBType dbType = DBType.H2;

    private Connection conn = null;

    private ConnectionManager() {    }

    public static ConnectionManager getInstance(){
        if (instance == null){
            instance = new ConnectionManager();
        }
        return instance;
    }

    public void setDbType(DBType dbType){
        instance.dbType = dbType;
    }

    public Connection getConnection() {
        if (conn == null) {
            if (openConnection()) {
                System.out.println("Connection opened");
                return conn;
            }else
                return null;
        }
        return conn;
    }

    private boolean openConnection() {
        try {
            switch (dbType) {
                case MySQL:
                    conn = DriverManager.getConnection(M_CONN_STRING, M_USERNAME, M_PASSWORD);
                    return true;
                case H2:
                    conn = DriverManager.getConnection(H_CONN_STRING, H_USERNAME, H_PASSWORD);
                default:
                    return false;
            }
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }
    public void close(){
        System.out.println("Closing connection");
        try {
            conn.close();
            conn = null;
        }catch (Exception e){
            System.out.println("sorry. we sorry");
        }
    }


}
