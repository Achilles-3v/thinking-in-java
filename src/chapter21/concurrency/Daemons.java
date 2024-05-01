package chapter21.concurrency;

import java.util.concurrent.*;

class Daemon implements Runnable {
    private Thread[] t = new Thread[10];
    public void run() {
    }
}

class DaemonSpawn implements Runnable {
    public void run() {
        while(true)
            Thread.yield();
    }
}

public class Daemons {
}
