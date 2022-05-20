package arrays;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class Main {
    final static Logger loger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

//        Integer[] array = new Integer[2];
        String string = "Hello";
        Object o = string;
        Integer i = new Integer(0);
        try {
            i = (Integer) o;
        }catch (ClassCastException ex){
            loger.error(ex, () -> ex.getMessage());
        }finally {
            loger.info(()->"logger final message");
        }

        try {
            assert i == new Integer(1);
        }catch (AssertionError as){
            loger.info(()->"assertion error");
            loger.info(as::getMessage);
        }

        assert i == new Integer(0);

        System.out.println(string);



    }
}
