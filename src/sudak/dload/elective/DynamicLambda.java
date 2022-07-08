package elective;

// for Function
//  java "function(x) x*5 + 1" 11 13 17

// for Predicate
//  java "function(x) (x+'').contains('7')" 11 13 17



import java.util.*;
import java.util.function.*;
import javax.script.*;

public class DynamicLambda {
    public static void main(String[] args) throws Exception{
        String[] funcArgs = Arrays.copyOfRange(args, 1, args.length);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        
//        String myFunc = args[0];
//        @SuppressWarnings("unchecked")
//        Function<Object, Object> func = (Function<Object, Object>) engine.eval(
//           String.format("new java.util.function.Function(%s)", myFunc ));
//        for( String x : funcArgs )
//            System.out.printf("%s*5 + 1 = %.0f\n", x, func.apply(x));

        String myFunc = args[0];
        @SuppressWarnings("unchecked")
        Predicate<Object> pred = (Predicate<Object>) engine.eval(
           String.format("new java.util.function.Predicate(%s)", myFunc ));
        for( String x : funcArgs )
            System.out.printf(x + " contains '7': " + pred.test(x) + "\n");



    }
}
