package just_test.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class K8_12Walk {
    public static void main(String[] args) throws IOException {
        Files.walk(Paths.get(System.getProperty("user.home")), 2)
                .forEach(p -> {
                    try {
                        System.out.println(p + " : " + Files.readAttributes(p, BasicFileAttributes.class).size());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}
