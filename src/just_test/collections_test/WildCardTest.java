package test.collections_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;


public class WildCardTest {

    static List<? extends Father> getThemm(){
        return Arrays.asList(new Son(), new Son(), new Father(), new Son());
    }

    public static void main(String[] args) throws IOException {
        List<? extends Father> list = getThemm();

        Path p1 = Paths.get("file1/./file.txt");//frage 8, 9, 10
        Files.walk(p1);

//        Path p2 = Paths.get("c:/file1/");
//        Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
        System.out.println(p1.toAbsolutePath());
//        run(list);
    }

    private static void run(List<Father> list) {
        list.add(new Father());
    }
}
class Father{}
class Son extends Father{}
