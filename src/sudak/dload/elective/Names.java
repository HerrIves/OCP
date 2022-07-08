package elective;
import java.util.*;

public class Names {
    
    public static void printNames(String str){
        System.out.println(str);
    }
    
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//        Names n = new Names();


//        names.forEach(Names::printNames);
        names.forEach(Names::printNames);
        
        
    }
}
