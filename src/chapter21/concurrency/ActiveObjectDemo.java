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
}
