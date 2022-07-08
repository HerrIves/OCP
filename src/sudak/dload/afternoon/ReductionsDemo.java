package afternoon;

import java.util.*;
import java.util.stream.*;

public class ReductionsDemo {
    public static void main(String[] args) {

        int sum =
//        OptionalInt op =
                IntStream.rangeClosed(0, 100)
//                         .parallel()
//                         .sum();
//                           .filter( n -> false)
                         .reduce(0, (n1,n2) -> { System.out.println("n1:" + n1);
                                                System.out.println("n2: " + n2);
                         return n1 - n2;} );
        
        System.out.println(sum);
        
        
    }
}
