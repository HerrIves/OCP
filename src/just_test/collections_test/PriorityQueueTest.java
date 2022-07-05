package test.collections_test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("1");
        queue.element();
        queue.peek();
        queue.offer("1");
        queue.poll();
        queue.remove("2");
        queue.clear();
    }
}
