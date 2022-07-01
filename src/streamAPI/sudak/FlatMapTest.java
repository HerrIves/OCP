package streamAPI.sudak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapTest {

    public static void main(String[] args) {
        List<Integer> secondList = Arrays.asList(3, 4);
        List<Integer>firstList = Arrays.asList(1, 2, 3);
//    List<int[]>pairs =
        firstList.stream()
                .flatMap(f->
                    secondList.stream().filter(s -> (f + s) % 6 == 0).map(s->new int[]{f, s}))
//                .filter(arr -> arr[0]*arr[1] % 6 == 0)

                .forEach(arr -> System.out.println(Arrays.toString(arr)));
                //                        secondList.stream().map(Int -> new int[]{Int, Int})


    }


}
