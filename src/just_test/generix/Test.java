package just_test.generix;

import java.util.Objects;

public class Test<T> {
    private T t;

    public Test(T i) {
        t = i;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test<?> test = (Test<?>) o;
        return Objects.equals(t, test.t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t);
    }
}

class Main {
    public static void main(String[] args) {
        Test<Integer> test = new Test<Integer>(100);
        System.out.println(test.getT().getClass());

//        System.out.println(test.getT());

        System.out.println(test.equals(new Test(100)));
    }
}
