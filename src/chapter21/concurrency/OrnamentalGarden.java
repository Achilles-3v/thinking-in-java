package chapter21.concurrency;

import java.util.concurrent.*;
import java.util.*;

class Count {
    private int count = 0;
    private Random rand = new Random(47);
    public synchronized int increment() {
        int temp = count;
        if(rand.nextBoolean())
            Thread.yield();
        return (count = ++temp);
    }
    public synchronized int value() { return count; }
}

public class OrnamentalGarden {
}