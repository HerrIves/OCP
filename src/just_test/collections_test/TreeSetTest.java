package test.collections_test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet =  new TreeSet<>();
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(4);

        treeSet.first();
        treeSet.last();

        treeSet.higher(1);
        treeSet.floor(1);

        treeSet.pollFirst();
        treeSet.pollLast();

        System.out.println(treeSet);

        Set set = treeSet.headSet(5, true);
        System.out.println(set);

        set = treeSet.tailSet(5);
        System.out.println(set);

        set = treeSet.subSet(4, false,  10, true);
        System.out.println(set);


    }
}
