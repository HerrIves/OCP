package just_test.streamAPI;


import oca.aufgabe01a.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.*;

public class StreamTest {
    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<Person>(Arrays.asList(new Person[]{new Person(), new Person(), new Person()}));

        Supplier<Integer> supplier = ()->new Random().nextInt();

        Consumer<Integer>consumer = (Integer i) -> System.out.println(i);
        consumer.accept(supplier.get());

        Function<Supplier<Integer>, Integer> trippleFunction = (sup) -> sup.get();
        int i = trippleFunction.apply(supplier);
        System.out.println(trippleFunction.apply(supplier));

        Predicate<Person> personPredicate = person -> person.currrentCount > 0;
        personArrayList.stream()
                .filter(personPredicate)
                .allMatch(p ->p.currrentCount>0);
//                .forEach(System.out::println);

        Car car = n -> System.out.println();
        car.drive2();




    }
}
interface Car<T>{
    void drive(String s);
    default void drive2(){
        System.out.println("!!");
    }

}