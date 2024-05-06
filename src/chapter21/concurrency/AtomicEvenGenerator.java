package chapter21.concurrency;

import java.util.concurrent.atomic.*;

public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenValue =
            new AtomicInteger(0);
    public int next() {
        return currentEvenValue.addAndGet(2);
    }
}
