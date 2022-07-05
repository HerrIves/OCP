package test.collections_test;

import java.util.Comparator;

public class CompareTest {
    static Comparator<Double>doubleComparator = Double::compareTo;

    public static void main(String[] args) {
        System.out.println(doubleComparator.compare(0.3, 0.1*3));
    }
}
