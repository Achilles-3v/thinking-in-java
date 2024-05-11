package chapter21.concurrency;

import java.util.concurrent.*;

class NeedsCleanup {
    private final int id;
    public NeedsCleanup(int ident) {
        id = ident;
        System.out.println("NeedsCleanup " + id);
    }
    public void cleanup() {
        System.out.println("Cleaning up " + id);
    }
}

public class InterruptingIdiom {
}
