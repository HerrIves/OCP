package test.collections_test;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueuesTest {
    public static void main(String[] args) {
        Queue queue = new ArrayDeque();
        queue.add(1);
        queue.element();
        queue.peek();
        queue.offer(1);
        queue.poll();
        queue.remove();
        queue.clear();
    }
}
