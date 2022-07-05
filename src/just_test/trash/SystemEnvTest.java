package just_test.trash;

import java.util.Map;

public class SystemEnvTest {
    public static void main(String[] args) {
        Map<String, String> stringMap = System.getenv();
        stringMap.forEach((x, y) ->System.out.println(x +" = " + y));
    }
}
