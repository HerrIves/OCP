package just_test.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MethodRefTest {
    static void method(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(MethodRefTest::method);
    }
}
