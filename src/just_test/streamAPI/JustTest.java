package just_test.streamAPI;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class JustTest {
    static Predicate<String> p = ((x)-> x.length() > 0);

    public static void main(String[] args) {
        p.test("");

        Stream.of("").allMatch(p);
    }
}

interface SomeClass {
    void test();
}

