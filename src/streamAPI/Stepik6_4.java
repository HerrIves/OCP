package streamAPI;

/*
    Берется какое-то начальное неотрицательное число (оно будет передаваться в ваш метод проверяющей системой).
    Первый элемент последовательности устанавливается равным этому числу.
    Следующие элементы вычисляются по рекуррентной формуле Rn+1=mid(Rn2) R_{n+1}=\mathrm{mid}(R_{n}^2) Rn+1​=mid(Rn2​),
    где mid — это функция, выделяющая второй, третий и четвертый разряд переданного числа.
    Например, mid(123456)=345 \mathrm{mid}(123456) = 345 mid(123456)=345.
 */

import java.util.function.*;
import java.util.stream.IntStream;



public class Stepik6_4 {
    public static void main(String[] args) throws InterruptedException {

        pseudoRandomStream(13)
                .limit(10)
                .forEach(System.out::println);

    }

    static Supplier<Integer> integerSupplier = () -> 1;

    public static IntStream pseudoRandomStream(int seed) {

        return IntStream.iterate(seed, input -> input = input*input/10%1000);
    }

    private static int numberGenerator2(int input) {

        input = input*input/10%1000;
//        System.out.println(input);


        return input;
    }

    public static int numberGenerator(int initInt) throws InterruptedException {
        int result;

        initInt *= initInt;
        String initIntToString = String.valueOf(initInt);
        final int LENGTH = initIntToString.length();

        if (LENGTH < 2) result = 0;
        else {

            int secondDigit = LENGTH - 1;
            int fourthDigit = LENGTH < 4 ? 0 : LENGTH - 4;

            String resultString = initIntToString.substring(fourthDigit, secondDigit);

            result = Integer.parseInt(resultString);
        }

        numberGenerator(result);

        return result;
    }

}
