package just_test.collectionExersises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class extensEx {
    public static void main(String[] args) {
        List<Number> numberL = Arrays.asList(1,2.0,6L);
//        numberL.add(10);
//        numberL.add(10.2);
        System.out.println(numberL);

    }

    ArrayList<Object> addObject(ArrayList<Object> objects){
        objects.add(new Integer(1));
        return objects;
    }
}
