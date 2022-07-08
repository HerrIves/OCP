package morning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingDemo {
    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> nums2 = Arrays.asList(6,7);
        List<List<Integer>> list = new ArrayList<>();
        list.add(nums1);
        list.add(nums2);

//        list
////                .stream()
////            .map(e -> e.stream())
//            .forEach(  e -> e.stream()
//                             .limit(3)
//                             .forEach(System.out::println));

        list.stream()
            .flatMap( e -> e.stream() )
            .filter(e -> false)
                
                
            .forEach(System.out::println);


    }
}
