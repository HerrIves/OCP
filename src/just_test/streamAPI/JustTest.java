package just_test.streamAPI;

import java.util.function.Predicate;

public class justTest {
    static Predicate<String> p = ((x)-> x.length() > 0);

    public static void main(String[] args) {
        p.test("");
    }
}

interface SomeClass {
    void test();
}

