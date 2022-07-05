package just_test.collectionExersises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CollectionsTest {
    public static void main(String [] args){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("3");
        list.add("2");

        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()){
            String s = iterator1.next();
//            System.out.println(s);
            iterator1.remove();
        }
        int i = 0;
        list.forEach(System.out::println);

    }

}
