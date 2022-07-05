package ocp.t_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class derbyConnectTest {
    public static final String DB_URL = "jdbc:derby://localhost:1527/sample";
  public static final String DB_USERNAME = "app";
  public static final String DB_PASSWORD = "app";

  public static void main(String[] args) throws SQLException {
        System.out.println("=                Read with JDBC                   =");
    System.out.println("===================================================");
    // Bevor JDBC 4.0 musste man den Treiber in die JVM manuell laden ===>
    // Class.forName("org.apache.derby.jdbc.ClientDriver");
    // ================ create a database connection =================
    Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    // ============= create a statement from connection ==============
    Statement stmt = con.createStatement();
    // =========== execute the query and get the resultset ===========
    String sqlString = "SELECT * FROM PERSON ORDER BY ID";
    ResultSet rs = stmt.executeQuery(sqlString);
    // ================= extract data from resultset =================
    List<Object> personList = new ArrayList<>();
    while(rs.next()) {
      long id = rs.getLong("ID");
      String firstname = rs.getString("FIRST_NAME");
      String lastname = rs.getString("LAST_NAME");
      System.out.println(firstname+" "+lastname);
    }
    // ==================== closing all resources ====================
    rs.close();
    stmt.close();
    con.close();
    // ========================= Datenausgabe ========================
    personList.forEach(System.out::println);
  }

}
