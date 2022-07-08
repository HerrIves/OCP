package evening;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        Map<Boolean, List<Integer>> map =
                nums.stream()
                    .collect(Collectors.partitioningBy(n -> n > 3));
        
        map.entrySet().forEach(System.out::println);

    }
}
