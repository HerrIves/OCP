package just_test.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class K8_10FilesMove {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("f1.txt");
        Files.createFile(p1.getFileName());

        Path p2 = Paths.get("f/f2.txt");

//        Files.createDirectories(p2.getParent());
//        Files.createFile(p2.getFileName());

        Files.move(p1, p2);                                     //thrown an exeption
        Files.move(p1, p2, StandardCopyOption.ATOMIC_MOVE);     //replaces file
    }


}
