package ocp.t_09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;

public class FilesTest {

    public static void main(String[] args) throws IOException {
        AclFileAttributeView attributeView = Files.getFileAttributeView(Paths.get("c:\\temp\\temp.txt"), AclFileAttributeView.class);
        attributeView.getAcl().forEach(System.out::println);

        Files.newDirectoryStream(Paths.get("c:\\temp"));

    }
}
