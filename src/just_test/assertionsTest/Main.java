package just_test.assertionsTest;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class Main {
    final static Logger loger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

//        Integer[] array = new Integer[2];eva
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

        boolean b;
        try {
            assert  b = i == new Integer(1) :"first";
        }catch (AssertionError as){
            loger.info(()->"assertion error");
            loger.info(as::getMessage);
        }

        assert i == new Integer(0): "second";

        System.out.println(string);



    }
}
