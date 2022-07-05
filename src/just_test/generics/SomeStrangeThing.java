package test.generics;

import java.util.*;

public class SomeStrangeThing {

    public static void main(String[] args) {
        addNumber(1.1);
        List<? super Number> list = new LinkedList<>();
        list.add(1.0);
    }

    static <Number> void addNumber(Number n){
        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(n);

    }
}

abstract class Abstr{
    static void print(){
        System.out.println();
    }
}
