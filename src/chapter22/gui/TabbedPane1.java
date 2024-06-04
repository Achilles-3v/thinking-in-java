package chapter22.gui;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import static net.achilles.util.SwingConsole.*;

public class TabbedPane1 extends JFrame {
    private String[] flavors = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    private JTabbedPane tabs = new JTabbedPane();
    private JTextField txt = new JTextField(20);
}