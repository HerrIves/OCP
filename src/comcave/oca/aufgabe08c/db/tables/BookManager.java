package oca.aufgabe08c.db.tables;

import oca.aufgabe08c.db.ConnectionManager;

import java.sql.*;

public class BookManager {

//        String sql = "INSERT INTO BOOKS VALUES(1, 'Java ist auch eine Insel', '978-3-8362-1802-3', '2011-01-01', 'Christian Ullenboom', 450);"


    private static Connection conn = ConnectionManager.getInstance().getConnection();

    public static void displayAllRows() throws SQLException {
        String sql = "SELECT * FROM books";

        try (
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("BOOKS TABLE:");
            while (rs.next()) {
                for (int i = 1; i < rsmd.getColumnCount(); i++) {
                    System.out.println(rs.getString(i) + " " + rsmd.getColumnName(i));
                }
            }
        }
    }

    public static Book getRow() {
        Book bean = null;
        String sql = "SELECT * FROM BOOKS " +
                "WHERE ID = ?";
        ResultSet rs = null;

        try (
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, 2);//InputHelper.readInt("Input Book index"));
            rs = stmt.executeQuery();

            if (rs.next()){
                String title = rs.getNString(2);
                String isbn = rs.getNString(3);
                Date datum = rs.getDate(4);
                String author = rs.getNString(5);
                int seitenNumber = rs.getInt(6);

                bean = new Book(
                        title, isbn, author);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return bean;
    }
}
