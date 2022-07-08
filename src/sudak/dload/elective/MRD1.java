package elective;

import java.util.stream.Stream;
import java.util.function.*;

public class MRD1 {
    public static void main(String[] args) {
//        Stream.<Double>generate(Math::random);
        Supplier<Double> supp = () -> Math.random();
        Stream.<Double>generate(supp)
                .limit(3)
                .forEach(System.out::println);
    }
}
