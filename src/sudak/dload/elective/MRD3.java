package elective;

import java.util.stream.Stream;

public class MRD3 {
    public static void main(String[] args) {
        String str = "hello";
        long n = Stream.of("hi", "bye", "hello")
//                .filter(String::equals)
//                .filter((string, anObject) -> string.equals(anObject))  
                .filter(str::equals)
                .count();
        System.out.println(n);
    }
}
