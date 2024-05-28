package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;
import java.util.regex.*;
import static net.achilles.util.SwingConsole.*;

public class ShowAddListeners extends JFrame {
    private JTextField name = new JTextField(25);
    private JTextArea results = new JTextArea(40, 65);
    private static Pattern addListener =
            Pattern.compile("(add\\w+?Listener\\(.*?\\))");
    private static Pattern qualifier =
            Pattern.compile("\\w+\\.");
}
