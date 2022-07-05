package ocp.properties;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("1", "one");
        properties.setProperty("2", "two");
        properties.put("3", "three");

        try(OutputStream out = new FileOutputStream("resources\\config.properties")){
            properties.store(out, "null");
        } catch (IOException e) {e.printStackTrace();}

        try {
            properties.load(new FileInputStream("resources\\config.properties"));
        } catch (IOException e) { e.printStackTrace();        }

        System.out.println(properties);

    }
}
