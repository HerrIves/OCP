package just_test.properties;

import java.io.*;
import java.util.Properties;

public class propTest02 {
    public static void main(String[] args) throws IOException {
        File propertyFile = new File("src/just_test/properties/test.properties");
        Properties properties = new Properties();

        properties.put("first", "1");
        properties.put("second", "2");
        properties.put("third", "3");

        properties.store(new FileOutputStream(propertyFile), null);

        properties.load(new FileInputStream(propertyFile));
        properties.forEach((k,v)-> System.out.println(k+" : "+v));

        properties.put("fourth", "4");
        properties.store(new FileOutputStream(propertyFile), null);
    }
}
