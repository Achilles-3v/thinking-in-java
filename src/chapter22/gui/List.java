package chapter22.gui;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import static net.achilles.util.SwingConsole.*;

public class List extends JFrame {
    private String[] flavors = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    private DefaultListModel lItems = new DefaultListModel();
    private JList lst = new JList(lItems);
    private JTextArea t =
            new JTextArea(flavors.length, 20);
    private JButton b = new JButton("Add Item");
    private ActionListener bl = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(count < flavors.length) {
                lItems.add(0, flavors[count++]);
            } else {
                b.setEnabled(false);
            }
        }
    };
    private ListSelectionListener ll =
            new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                    if(e.getValueIsAdjusting()) return;
                    t.setText("");
                    for(Object item : lst.getSelectedValues())
                        t.append(item + "\n");
                }
            };
    private int count = 0;
}