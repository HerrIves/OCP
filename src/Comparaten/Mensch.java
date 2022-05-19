package Comparaten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Mensch implements Comparable<Mensch>, Comparator<Mensch> {
    String name;
    int age;

    public Mensch(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Mensch o) {
        return name.compareTo(o.name);
    }

    @Override
    public int compare(Mensch o1, Mensch o2) {
        return o1.compareTo(o2);
    }

    @Override
    public String toString() {
        return "Mensch{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Mensch> menschArrayList = new ArrayList<>(Arrays.asList(new Mensch("Slavik"), new Mensch("Araik")));
        Collections.sort(menschArrayList, new Mensch("comparator"));
        menschArrayList.forEach(System.out::println);
    }
}
