package elective;

import java.util.stream.Stream;

public class MRD5 {
    static int runStatic (int a){  return a*a; }
    int runInstance(int a){  return a*a*a; }    
    
    public static void main(String[] args) {
//        new MRD5().runStatic(10);

//        Stream.of(1,2,3).map( new MRD5()::runInstance  )
//                .forEach(System.out::println);
//        Stream.of(1,2,3).map( new MRD5()::runStatic  )
        Stream.of(1,2,3).map((a) -> new MRD5().runStatic(a))
                .forEach(System.out::println);

    }
}
