package just_test.streamAPI;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * zum Frage Pool k05 - 12.
 * Seite 158.
 *
 * @author Evgeny Ivanov
 * @version 1.0
 */

public class IntFunctionTest {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1,2,3);
        IntFunction<IntUnaryOperator>intFu = new IntFunction<IntUnaryOperator>() {
            @Override
            public IntUnaryOperator apply(int x) {
                return new IntUnaryOperator() {
                    @Override
                    public int applyAsInt(int y) {
                        return x * y;
                    }
                };
            }
        };
        IntStream newStream = stream.map(intFu.apply(10));
        newStream.forEach(System.out::println);

    }
}
