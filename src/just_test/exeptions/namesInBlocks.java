package just_test.exeptions;

import java.io.File;
import java.io.IOException;

public class namesInBlocks {
    public static void main(String[] args) {
        try {
            File fName = File.createTempFile(null,"temp.tmp");
        } catch (IOException e) {
            String fName;
            e.printStackTrace();
        }finally {
            String fName;
        }
    }
}
