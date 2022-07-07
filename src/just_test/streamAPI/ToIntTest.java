package just_test.streamAPI;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class ToIntTest {
    public static void main(String[] args) {
        String s = "";
        ToIntFunction<String> toIntFunction = s::indexOf;
        int i = toIntFunction.applyAsInt("a");
    }
}
