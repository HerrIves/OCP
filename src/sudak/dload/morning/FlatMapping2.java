package morning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapping2 {
    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> squares =
//                nums.stream()
//                    .map(n -> n*n)
//                    .collect( Collectors.toList() );
//        System.out.println(squares);
        
//        List<Integer> nums1 = Arrays.asList(1, 2, 3);
//        List<Integer> nums2 = Arrays.asList(4,5);
//        
//        List<int[]> pairs =
//                nums1.stream()
//                     .flatMap( i -> nums2.stream()
//                                         .map(j -> new int[]{i,j} )
//                     )
//                    .collect( Collectors.toList() );
//        pairs.forEach(arr -> System.out.println(Arrays.toString(arr)));
        
        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(3,4);
        
        List<int[]> pairs =
                nums1.stream()
                     .flatMap( i -> 
                             nums2.stream()
                                  .filter(j -> (i + j)%3 == 0)
                                  .map(j -> new int[]{i, j})
                     )
                    .collect( Collectors.toList() );
        pairs.forEach(arr -> System.out.println(Arrays.toString(arr)));
                     



    }
}
