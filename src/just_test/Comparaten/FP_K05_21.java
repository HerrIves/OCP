package just_test.Comparaten;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FP_K05_21 {
    public static void main(String[] args) {
        List<Integer>integerList = Arrays.asList(10, 4, 2);
        integerList.stream()
                .max(Comparator.comparing(a -> a))
                .get();
    }
}
