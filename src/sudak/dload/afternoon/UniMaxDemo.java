package afternoon;

import java.util.*;
import java.util.Map.Entry;

class UniMax{
    static <K,V> Entry<K,V> maxEntryByVal(Map<K,V> map, Comparator<V> comp){
        Entry<K,V> entry =
           Collections.max( map.<K,V>entrySet(), Entry.<K,V>comparingByValue(comp) );
        return entry;
    }

}



public class UniMaxDemo {
    public static void main(String[] args) {
        Map<String, Long> longs = new HashMap<>();
        longs.put("-10L", -10L);
        longs.put("10L", 10L);

        Map<String, Double> doubles = new HashMap<>();
        doubles.put("-10.0", -10.0);
        doubles.put("10.0", 10.0);
        
        System.out.println(
                UniMax.maxEntryByVal(longs, Long::compare)     // 10L=10
        );
        System.out.println(
                UniMax.maxEntryByVal(doubles, Double::compare) // 10.0=10.0  
        );
        
        
    }
}
