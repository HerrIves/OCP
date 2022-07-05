package test.streamAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStarters {
    static Set<String> stringSet = new HashSet<>();

    public static void main(String[] args) {
        stringSet.stream();

        DoubleStream.generate(Math::random);
        String s = IntStream.range(10, 100)
                .peek(System.out::println)
                .mapToObj(i ->String.valueOf((char)i))
                .findAny()
                .get();
        System.out.println(s);

        int number = 5;
        IntStream.range(1, number)
                .mapToObj(i -> BigInteger.valueOf(i))
                .reduce(BigInteger::multiply);

        String palindrome = "napapan";

        palindrome.chars();


        Random random = new Random();

        IntStream.generate(()->random.nextInt());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.lines()
                .limit(10)
                .map(function)
                .filter( i -> i > 3);
//                .forEach(System.out::println);
    }
    public static Function <String, Integer> function = new Function<String, Integer>() {
        @Override
        public Integer apply(String s) {
            return Integer.parseInt(s);
        }
    };
}
