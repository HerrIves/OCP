package just_test.streamAPI.myown;

import java.util.function.Predicate;

public interface CourseFilter extends Predicate<String> {
    default boolean test(String s){
        return s.equals("s");
    }

    public static void main(String[] args) {
        CourseFilter filter = new CourseFilter() {
        };

        Predicate<String>predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };

        assert predicate.test(""):"hello";

    }
}
