package oca.aufgabe10a;

public class MainController {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            throw new Exception("exeption");
        } catch (Exception e) {
            System.out.println("catch");
            System.exit(0);
        }finally {
            System.out.println("finally");
        }

    }
}
