package net.achilles.util;

import java.util.concurrent.*;
import java.util.*;

public class TaskManager<R,C extends Callable<R>>
        extends ArrayList<TaskItem<R,C>> {
    private ExecutorService exec =
            Executors.newSingleThreadExecutor();
    public void add(C task) {
        add(new TaskItem<R,C>(exec.submit(task),task));
    }
}
