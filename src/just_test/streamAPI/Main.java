package just_test.streamAPI;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<T> condition,
            Function<T, U> ifTrue,
            Function<T, U> ifFalse) {

        return new Function<T, U>() {
            @Override
            public U apply(T t) {
                return condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
            }

        };
    }

    public static void main(String[] args) {
    }
}
