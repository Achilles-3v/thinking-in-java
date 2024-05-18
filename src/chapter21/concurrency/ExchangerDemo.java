package chapter21.concurrency;

import java.util.concurrent.*;
import java.util.*;
import net.achilles.util.*;

class ExchangerProducer<T> implements Runnable {
    private Generator<T> generator;
    private Exchanger<List<T>> exchanger;
    private List<T> holder;
    ExchangerProducer(Exchanger<List<T>> exchg,
                      Generator<T> gen, List<T> holder) {
        exchanger = exchg;
        generator = gen;
        this.holder = holder;
    }
    public void run() {
        try {
            while(!Thread.interrupted()) {
                for(int i = 0; i < ExchangerDemo.size; i++)
                    holder.add(generator.next());
                holder = exchanger.exchange(holder);
            }
        } catch(InterruptedException e) {
        }
    }
}

public class ExchangerDemo {
    static int size = 10;
    static int delay = 5;
}
