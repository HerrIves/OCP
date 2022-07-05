package test.exeptions;

public class exeptTest extends Exception{
    public static void main(String[] args) throws exeptTest {
        int a = 0;
        if (a > 0) throw new exeptTest();
        throw new ex();
    }

}
class ex extends exeptTest{}


