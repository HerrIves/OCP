package just_test.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class K8_08_FilePath {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/comcave/./ocp/"); //ohne slash before - bedouted current directory
        System.out.println(path.toAbsolutePath());

        Path path2 = Paths.get("/src/comcave/./ocp/"); //mit slash before - bedouted root directory
        System.out.println(path2.toAbsolutePath() +"\n");


        Path res1 = path.resolve("res.txt");
        System.out.println(res1);
        File f1 = new File(String.valueOf(res1));
        System.out.println(f1.getCanonicalPath() + "\n");


        Path res2 = path.resolve("/res.txt");
        System.out.println(res2);
        File f2 = new File(String.valueOf(res2));
        System.out.println(f2.getCanonicalPath());

//        Files.lines(Paths.get(f1.getCanonicalPath())).forEach(System.out::println);
    }
}
