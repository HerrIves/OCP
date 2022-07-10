package just_test.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class K8_11Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;

        try(//  reader = DON'T WORK
                BufferedReader reader1 =
                        new BufferedReader(new InputStreamReader(System.in)))
        {
            reader = reader1;
            reader.lines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.ready();
    }
}
