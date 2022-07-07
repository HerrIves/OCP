package just_test.collections_test;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;

public class mapTest {
    public static int returnInt(){
        Map<String, Integer> integers = new HashMap<>();
        integers.put("2", 2);
        integers.get(1);
        integers.entrySet();


        BiConsumer<String, Integer>biConsumer = (str, intg)-> System.out.print(str +" : "+ intg);
        integers.forEach(biConsumer.andThen(biConsumer));

        System.out.println("\n\nintegers.compute(\"2\", (k,v)->k.length());");
        integers.compute("2", (k,v)->k.length());
        integers.forEach((k, v) -> System.out.println(k +" "+ v));

        integers.replaceAll((k, v) -> v=k.equals("2")?10:5);
        integers.forEach((k, v) -> System.out.println(k +" "+ v));




        return -1;
    }



    public static void main(String[] args) {

        System.out.println(returnInt());
    }
}
