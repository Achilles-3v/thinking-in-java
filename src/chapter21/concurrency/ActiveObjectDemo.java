package chapter21.concurrency;

import java.util.concurrent.*;
import java.util.*;

public class ActiveObjectDemo {
    private ExecutorService ex =
            Executors.newSingleThreadExecutor();
    private Random rand = new Random(47);
    private void pause(int factor) {
        try {
            TimeUnit.MILLISECONDS.sleep(
                    100 + rand.nextInt(factor));
        } catch(InterruptedException e) {
            System.out.println("sleep() interrupted");
        }
    }
    public Future<Integer>
    calculateInt(final int x, final int y) {
        return ex.submit(new Callable<Integer>() {
            public Integer call() {
                System.out.println("starting " + x + " + " + y);
                pause(500);
                return x + y;
            }
        });
    }
}
