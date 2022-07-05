package just_test;

import java.util.*;

public class Test implements Test1Interface {

    public static void main(String... args) {

        Object[] ba = new Object[5];
        Map<String, Object> s = new TreeMap();
// insert code here
        ba[0] = s.put("a", null);
        ba[1] = s.put("b", new Integer(42));
        ba[2] = s.put("b", null);
        ba[3] = s.put("a", null);
        ba[4] = s.put("s", new Object());
        s.get(new String());

        for (int x = 0; x < ba.length; x++)
            System.out.print(ba[x] + " ");

        System.out.println();

        Iterator<Map.Entry<String, Object>> iterator = s.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Object> entry = iterator.next();
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
