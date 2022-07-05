package test.streamAPI.myown;

@FunctionalInterface
public interface Consumer<T> {
    void someConsumer(T t);
}
