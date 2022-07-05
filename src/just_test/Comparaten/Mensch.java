package just_test.Comparaten;

import java.util.*;

class Mensch
//implements Comparable<Mensch>, Comparator<Mensch>
{
    String name;
    int age;

    public Mensch(String name){
        this.name = name;
    }

//    @Override
//    public int compareTo(Mensch o) {
//        return name.compareTo(o.name);
//    }
//
//    @Override
//    public int compare(Mensch o1, Mensch o2) {
//        return o1.compareTo(o2);
//    }

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
        TreeSet<Mensch> menschTreeSet= new TreeSet<Mensch>(Arrays.asList(new Mensch("Slavik"), new Mensch("Araik")));

    }
}
