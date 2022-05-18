package arrays;

public class Main {
    public static void main(String[] args) {

//        Integer[] array = new Integer[2];
        String string = "Hello";
        Object o = string;
        Integer i = (Integer) o;
        o = (Object) i;
        string = (String) o;

        System.out.println(string);


    }
}
