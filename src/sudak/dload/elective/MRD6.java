package elective;

import java.util.Comparator;
import java.util.stream.Stream;

public class MRD6 {
    static <T> int run(T t1, T t2){
        if (  !(t1 instanceof String) || !(t2 instanceof String) )
            return 0;
        return ((String)t1).length() - ((String)t2).length(); 
    }
    
    
    public static void main(String[] args) {
        Stream.of("ccc ", "aaa ", "bb ")
//                .sorted()
//                .sorted( Comparator.reverseOrder()  )
//                .sorted( Comparator::reverseOrder  )
//                .sorted( (a,b) -> a.length() - b.length()  )
//                .sorted( MRD6::run   )
                .forEach(System.out::println);
    }
}
