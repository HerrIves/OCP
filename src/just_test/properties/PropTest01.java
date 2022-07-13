package just_test.properties;

import java.io.*;
import java.util.Properties;

public class PropTest01 {
    public static void main(String[] args) throws IOException {

        Properties h2Properties = new Properties();
        File h2PropertiesFile = new File("C:/Users/CC-Student/.h2.server.properties");

        if (h2PropertiesFile.exists()) {
            h2Properties.load(new BufferedInputStream(new FileInputStream(h2PropertiesFile)));

            h2Properties.forEach((k, v) -> System.out.println(k + " : " + v));
        }

    }
}
