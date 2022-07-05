package just_test.inheritance;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Number b = new Integer("1");

        Func f = ()-> 5;
        int i = f.calc();

        List<? extends Number> list = new ArrayList<Integer>();

        List maList = list;

    }
}

interface Func {
    int calc();
}