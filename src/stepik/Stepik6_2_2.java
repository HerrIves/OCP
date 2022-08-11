package stepik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
    Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами,
    затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность
    в обратном порядке в System.out.

    Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.

    В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.
*/

public class Main {
    static int x = 0;
    static Predicate<String> stringPredicate = s -> {
        x++;
        return x%2 == 0;
    };
    public static void readNumbers() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        try { input = reader.readLine();
        } catch (IOException e) {            e.printStackTrace();        }

        if (input == null) return;

        Arrays.stream(input.split(" "))
                .filter(stringPredicate)
                .collect(Collectors.toCollection(ArrayDeque::new))
                .descendingIterator()
                .forEachRemaining(x-> System.out.print(x + " "));

    }

    public static void main(String[] args){
        readNumbers();
        }
}
