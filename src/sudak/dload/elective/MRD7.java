package elective;

// zero arg ----> Supplier
// arg?  ---> Function, BiFunction

import java.util.function.*;



public class MRD7 {
    public MRD7() {
        System.out.println("zero arg");
    }
    
    public MRD7(int arg) {
        System.out.println("1-arg: " + ++arg);
    }
    
    public static void main(String[] args) {
        Supplier<MRD7> supp = MRD7::new;
        supp.get();
        Function<Integer, MRD7> func = MRD7::new;
        System.out.println("main(): " + func.apply(42));
    }
}
