package just_test.streamAPI;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        UnaryOperator unaryOperator = UnaryOperator.identity();
        unaryOperator.apply("hi there");
        System.out.println(unaryOperator.apply("one"));
    }
}
