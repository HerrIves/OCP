package comcave;

import oca.aufgabe01d.Start;

import java.sql.Connection;
import java.sql.DriverManager;

public class test {
//
//    public static void main(String[] a)
//            throws Exception {
//        Connection conn = DriverManager.
//                getConnection(
//                        "jdbc:mysql://localhost:3306/sonoo"
//                        "jdbc:mysql//192.168.0.206:3306/hiber", "hiber", "123"
//                        "jdbc:h2:~/test", "sa", ""
//                        );
//        // add application code here
//        conn.close();
//    }
//    public static long summe(long a, long b) {
//        int k;
//        return a + b;
//    }
public static void main(String[] args) {
    byte b = 5;
    go(b, b);
}

    // ==============================================
    static void go(byte x, byte y) {    // 1.
        System.out.println("byte,byte");
    }
    // ==============================================
    static void go(int x, int y) {      // 2.
        System.out.println("int,int");
    }

    static void go(Byte x, Byte y) {   // 3.
        System.out.println("Byte,Byte");
    }

    static void go(Integer x, Integer y) { // NIEMALS
        System.out.println("Integer,Integer");
    }
    // ==============================================
    static void go(byte... x) {        // 4.
        System.out.println("byte... ");
    }
    // ==============================================
    static void go(int... x) {        // 5.
        System.out.println("int... ");
    }
}

