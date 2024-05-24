package chapter21.concurrency;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.util.*;

public class ReaderWriterList<T> {
    private ArrayList<T> lockedList;
    private ReentrantReadWriteLock lock =
            new ReentrantReadWriteLock(true);
    public ReaderWriterList(int size, T initialValue) {
        lockedList = new ArrayList<T>(
                Collections.nCopies(size, initialValue));
    }
    public T set(int index, T element) {
        Lock wlock = lock.writeLock();
        wlock.lock();
        try {
            return lockedList.set(index, element);
        } finally {
            wlock.unlock();
        }
    }
    public T get(int index) {
        Lock rlock = lock.readLock();
        rlock.lock();
        try {
            if(lock.getReadLockCount() > 1)
                System.out.println(lock.getReadLockCount());
            return lockedList.get(index);
        } finally {
            rlock.unlock();
        }
    }
}

class ReaderWriterListTest {
    ExecutorService exec = Executors.newCachedThreadPool();
    private final static int SIZE = 100;
    private static Random rand = new Random(47);
    private ReaderWriterList<Integer> list =
            new ReaderWriterList<Integer>(SIZE, 0);
    private class Writer implements Runnable {
        public void run() {
            try {
                for(int i = 0; i < 20; i++) {
                    list.set(i, rand.nextInt());
                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch(InterruptedException e) {
            }
            System.out.println("Writer finished, shutting down");
            exec.shutdownNow();
        }
    }
}
