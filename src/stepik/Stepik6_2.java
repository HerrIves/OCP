package stepik;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

 class Stepik6_2 {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Stream<? extends T> set1Stream =
                set1.stream()
                        .filter((e)-> !set2.contains(e));

        Stream<? extends T> set2Stream =
                set2.stream()
                        .filter((e)-> !set1.contains(e));

        Set<T> result = new HashSet<>();
        Stream.concat(set1Stream, set2Stream).iterator().forEachRemaining(result::add);

        return result;
    }
}

class Stepik6_2OhneStreams {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> result = new HashSet<>();

        set1.stream().filter((e) -> !set2.contains(e)).iterator().forEachRemaining(result::add);
        set2.stream().filter((e) -> !set1.contains(e)).iterator().forEachRemaining(result::add);

        return result;

    }
}
