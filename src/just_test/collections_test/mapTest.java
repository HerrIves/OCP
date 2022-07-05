package test.collections_test;
import java.util.*;

public class mapTest {
    public static int returnInt(){
        Map<String, Integer> integers = new HashMap<>();
        integers.put("2", 2);
        integers.get(1);
        integers.entrySet();

        Integer i = 0;
//                integers.get("1");
        System.out.println(i);

        return i;
    }

    public static void main(String[] args) {
        System.out.println(returnInt());
    }


}
