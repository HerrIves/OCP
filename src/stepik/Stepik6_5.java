package stepik;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stepik6_5 {

    public static void main(String[] args) {
        List<Object> list = Stream.empty().collect(Collectors.toList());
        System.out.println(list.isEmpty());
//        System.out.println(list.get(0));

    }


    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        T min = null;
        T max = null;

        List<? extends T> list = stream.sorted(order)
                .collect(Collectors.toList());

        if (list.isEmpty()) minMaxConsumer.accept(null, null);
        else minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
    }
}

