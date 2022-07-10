package just_test.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class K8_08_FilePath {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/comcave/./ocp/");
        System.out.println(path.toAbsolutePath());
        Path res1 = path.resolve("res.txt");
        System.out.println(res1);
        File f = new File(String.valueOf(res1));
        System.out.println(f.getCanonicalPath());

        Files.lines(Paths.get(f.getCanonicalPath())).forEach(System.out::println);
    }
}
