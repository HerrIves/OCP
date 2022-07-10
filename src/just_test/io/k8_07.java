package just_test.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class k8_07 {
    public static void main(String[] args) {
        Stream<Path>paths = Stream.of(Paths.get("data.txt"), Paths.get("data.dat"), Paths.get("data.xml"));
        paths.filter(p->p.toString().endsWith(".txt")).forEach(s->{
            try{
                Files.readAllLines(s)
                        .stream()
                        .forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
