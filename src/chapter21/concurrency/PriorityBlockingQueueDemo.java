package chapter21.concurrency;

import java.util.concurrent.*;
import java.util.*;

class PrioritizedTask implements
        Runnable, Comparable<PrioritizedTask>  {
    private Random rand = new Random(47);
    private static int counter = 0;
    private final int id = counter++;
    private final int priority;
    protected static List<PrioritizedTask> sequence =
            new ArrayList<PrioritizedTask>();
    public PrioritizedTask(int priority) {
        this.priority = priority;
        sequence.add(this);
    }
    public int compareTo(PrioritizedTask arg) {
        return priority < arg.priority ? 1 :
                (priority > arg.priority ? -1 : 0);
    }
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(rand.nextInt(250));
        } catch(InterruptedException e) {
        }
        System.out.println(this);
    }
    public String toString() {
        return String.format("[%1$-3d]", priority) +
                " Task " + id;
    }
    public String summary() {
        return "(" + id + ":" + priority + ")";
    }
    public static class EndSentinel extends PrioritizedTask {
        private ExecutorService exec;
        public EndSentinel(ExecutorService e) {
            super(-1);
            exec = e;
        }
        public void run() {
            int count = 0;
            for(PrioritizedTask pt : sequence) {
                System.out.print(pt.summary());
                if(++count % 5 == 0)
                    System.out.println();
            }
            System.out.println();
            System.out.println(this + " Calling shutdownNow()");
            exec.shutdownNow();
        }
    }
}

class PrioritizedTaskProducer implements Runnable {
    private Random rand = new Random(47);
    private Queue<Runnable> queue;
    private ExecutorService exec;
    public PrioritizedTaskProducer(
            Queue<Runnable> q, ExecutorService e) {
        queue = q;
        exec = e;
    }
    public void run() {
        for(int i = 0; i < 20; i++) {
            queue.add(new PrioritizedTask(rand.nextInt(10)));
            Thread.yield();
        }
        try {
            for(int i = 0; i < 10; i++) {
                TimeUnit.MILLISECONDS.sleep(250);
                queue.add(new PrioritizedTask(10));
            }
            for(int i = 0; i < 10; i++)
                queue.add(new PrioritizedTask(i));
            queue.add(new PrioritizedTask.EndSentinel(exec));
        } catch(InterruptedException e) {
        }
        System.out.println("Finished PrioritizedTaskProducer");
    }
}

public class PriorityBlockingQueueDemo {
}
