package ocp.t_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchroTest {
    static AtomicInteger synchroNotInt = new AtomicInteger(10);

    static {
        synchroNotInt.addAndGet(10);
    }

    synchronized void setSynchroNotInt() {
        System.out.println("set");
        synchronized (this) {
            synchroNotInt.getAndAdd(1);
            try {
                Thread.sleep(new Random().nextInt());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(synchroNotInt.get());
    }

    synchronized void removeSynchroNotInt() {
        System.out.println("remove");
        synchronized (this) {
            synchroNotInt.getAndAdd(-1);
            try {
                Thread.sleep(new Random().nextInt());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(synchroNotInt.get());
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = Arrays.asList(
            new Thread(new addRunnable()),
            new Thread(new addRunnable()),
            new Thread(new removeRunnable()),
            new Thread(new removeRunnable())
        );
        threads.forEach(Thread::start);

            while (synchroNotInt.get() > 0){
                Thread.sleep(1000);
            }
            threads.forEach(Thread::interrupt);

        }
    }

class addRunnable implements Runnable {
    @Override
    public void run() {
        SynchroTest test = new SynchroTest();
        while (true){
            test.setSynchroNotInt();
        }
    }
}
class removeRunnable implements Runnable {
    @Override
    public void run() {
        SynchroTest test = new SynchroTest();
        while (true){
            test.removeSynchroNotInt();
        }
    }
}
