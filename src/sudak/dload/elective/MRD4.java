package elective;
// Supplier<Double> supp = () -> Math.random();
// Consumer<Integer[]> cons = arr -> Arrays.sort(arr); 

import java.util.stream.Stream;


public class MRD4 {
    
    void KOT(){}
    void KOTEHOK(MRD4 arg){}
    static void COBA(){}
    static void COBEHOK(MRD4 arg){}
    
    public static void main(String[] args) {
//        Stream s = 
//                Stream.<MRD4>of(new MRD4());
//                    s.peek(MRD4::KOT);
//                    s.forEach(MRD4::COBEHOK);
        Stream<MRD4> s = Stream.of(new MRD4());
        s.peek(MRD4::KOT)
//         .peek(MRD4::KOTEHOK)
//         .peek(() -> MRD4.COBA());
         .peek(MRD4::COBEHOK);
    }
}
