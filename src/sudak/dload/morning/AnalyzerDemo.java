package morning;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

interface Analyzable<T>{
    boolean analyze(T sample);
}

//class AnalyzerString implements Analyzable<String>{
//    @Override
//    public boolean analyze(String sample){
//        return sample.length() > 3;
//    }
//}

class Analyzer<T>{
//    boolean check(T sample, Analyzable<T> instr  ){
//        return instr.analyze(sample);
//    }
    boolean check(T sample, Predicate<T> pred  ){
        return pred.test(sample);
    }
}

public class AnalyzerDemo {
    public static void main(String[] args) {
        String sample = "Hello, lambdas!";
        String pattern = "lambdas!";
        
        Analyzer<String> box = new Analyzer<>();
        Analyzable<String> instrCont = str -> str.contains(pattern);
        Analyzable<String> instrSW = str -> str.startsWith(pattern);
        Predicate<String> predEW = str -> str.endsWith(pattern);
        
//        boolean res = box.check(sample, new Analyzable<String>() {
//            @Override
//            public boolean analyze(String sample) {
//                return sample.contains(pattern);
//            }
//        });
//        boolean res = box.check(sample, instrSW);
        boolean res = box.check(sample, predEW);
        System.out.println(res);

    }

}
