package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;
import java.util.*;
import static net.achilles.util.SwingConsole.*;

public class ColorBoxes extends JFrame {
    private int grid = 12;
    private int pause = 50;
    private static ExecutorService exec =
            Executors.newCachedThreadPool();
}
