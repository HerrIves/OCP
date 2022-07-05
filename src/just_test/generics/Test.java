package test.generics;

public class Test<U>{
    private U u;

    public Test(U u){
        this.u = u;
    }

    public U getU() {
        return u;
    }

    @Override
    public String toString() {
        return "Test{" +
                "u=" + u +
                '}';
    }
}
