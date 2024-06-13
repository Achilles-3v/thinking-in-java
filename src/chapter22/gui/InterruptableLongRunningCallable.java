package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.*;
import net.achilles.util.*;
import static net.achilles.util.SwingConsole.*;

class CallableTask extends Task
        implements Callable<String> {
    public String call() {
        run();
        return "Return value of " + this;
    }
}

public class InterruptableLongRunningCallable extends JFrame {
    private JButton
            b1 = new JButton("Start Long Running Task"),
            b2 = new JButton("End Long Running Task"),
            b3 = new JButton("Get results");
    private TaskManager<String,CallableTask> manager =
            new TaskManager<String,CallableTask>();
}