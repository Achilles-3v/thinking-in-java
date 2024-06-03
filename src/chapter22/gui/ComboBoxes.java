package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.achilles.util.SwingConsole.*;

public class ComboBoxes extends JFrame {
    private String[] description = {
            "Ebullient", "Obtuse", "Recalcitrant", "Brilliant",
            "Somnescent", "Timorous", "Florid", "Putrescent"
    };
    private JTextField t = new JTextField(15);
    private JComboBox c = new JComboBox();
    private JButton b = new JButton("Add items");
    private int count = 0;
}
