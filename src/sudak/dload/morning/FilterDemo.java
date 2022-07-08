package morning;

import java.util.*;

public class FilterDemo {

    public static void main(String[] args) {
        Student kolya1 = new Student("Kolya", 12, 3.5);
        Student masha1 = new Student("Masha", 14, 5);
        Student petya = new Student("Petya", 128, 0.3);
        Student vitya = new Student("Vitya", 14, 4.5);
        Student sasha1 = new Student("Sasha", 12, 3.5);
        Student pasha = new Student("Pasha", 15, 4.5);
        Student masha2 = new Student("Masha", 18, 2.5);
        Student sasha2 = new Student("Sasha", 19, 7.5);
        Student mila = new Student("Mila", 23, 3.5);
        Student lena = new Student("Lena", 32, -3.5);
        Student kolya2 = new Student("Kolya", 42, 4.5);
        Student kolya3 = new Student("Kolya", 32, 4.9);
        
        List<Student> students = new ArrayList<>();
        students.add(kolya2);
        students.add(kolya1);
        students.add(masha1);
        students.add(petya);
        students.add(vitya);
        students.add(sasha1);
        students.add(kolya3);
        students.add(pasha);
        students.add(masha2);
        students.add(sasha2);
        students.add(mila);
        students.add(lena);
        
        students.stream()
                .map(s -> s + "")
                .map(String::new)
                .filter(s -> s.toLowerCase().contains("h"))
                .forEach(System.out::println);
        
    }

}
