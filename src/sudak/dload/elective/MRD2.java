package elective;

import java.util.stream.Stream;

public class MRD2 {
    
    boolean instamet() { return true;}
    static boolean statmet() { return true;}
    
    public static void main(String[] args) {
        // x ---> Class::statmet(x)
        // x ---> x.instamet()
        MRD2 m2 = new MRD2();
        Stream.generate(MRD2::new)
                .limit(3)
//                .filter(() -> MRD2.statmet())
//                .filter(() -> m2.instamet())
                .filter(MRD2::instamet)
                .filter((mrD2) -> mrD2.instamet())
                .forEach(System.out::println);
        
        
    }
}
