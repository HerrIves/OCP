package stepik;

import java.util.*;

import static stepik.Stepik6_2OhneStreams.symmetricDifference;

public class Stepik6_2Main {
    public static void main(String[] args) {

        Set<String> num1 = new HashSet<>();
        num1.add("3");
        num1.add("7");
        num1.add("9");

        HashSet<String> num2 = new HashSet<>();
        num2.add("5");
        num2.add("7");
        num2.add("12");

        Set<String> result = symmetricDifference(num1, num2);
        System.out.println(result);

    }
}