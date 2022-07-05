package test.collections_test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.get(1);
        list.set(1, 1);
        list.remove(1);
        list.clear();

        list.replaceAll(/*new ListTest().doubleUnaryOperator // dont work */null);



    }
    UnaryOperator<Double> doubleUnaryOperator = d -> d*2;
}
