package sudak;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class t88_MapMax {
    static <K, V> Entry<K, V> maxMapEntry(Map<K, V> map, Comparator<Entry<K,V>> comp){
        Entry<K, V> entry =
                Collections.max(map.<K, V>entrySet(), comp);
        return entry;
    }

    public static void main(String[] args) {
        Map<String, Long> longs = new HashMap<>();
        longs.put("-10", -10L);
        longs.put("10", 10L);
        longs.put("100", 100L);

        Map<String, Double> doubles = new HashMap<>();
        doubles.put("-10.0", -10D);
        doubles.put("10.0", 10D);
        doubles.put("100.0", 100D);


        Comparator<Long>longComparator = Long::compareTo;

        System.out.println(maxMapEntry(longs, Entry.comparingByValue(longComparator)));
        System.out.println(maxMapEntry(doubles, Entry.comparingByValue()));


    }

}
