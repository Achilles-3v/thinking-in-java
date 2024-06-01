package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import net.achilles.util.*;
import static net.achilles.util.SwingConsole.*;

public class TextPane extends JFrame {
    private JButton b = new JButton("Add Text");
    private JTextPane tp = new JTextPane();
    private static Generator sg =
            new RandomGenerator.String(7);
}
