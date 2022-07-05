package just_test.collectionExersises;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQTest {
    static class PQSort implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }

        public static void main(String[] args) {
            int[] ia = {1,5,3,7,6,9,8};

            PriorityQueue<Integer> pQ = new PriorityQueue<>();
            for (int x : ia){
                pQ.offer(x);
            }
            for (int x: ia) {
                System.out.print(pQ.poll() + " ");
            }
            System.out.println("\n" + pQ.size());


            PriorityQueue<Integer> pQ2 = new PriorityQueue<>(new PQSort());
            for (int x: ia) {
                pQ2.offer(x);
            }
            System.out.println("pQ2.size() = " + pQ2.size());
            System.out.println("pQ2.peek() = " + pQ2.peek());
            System.out.println("pQ2.size() = " + pQ2.size());
            System.out.println("pQ2.pool = " + pQ2.poll());
            System.out.println("pQ2.size() = " + pQ2.size());

            for (int x : ia) {
                System.out.print(pQ2.poll() + " ");
            }



        }
    }

}
