package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.achilles.util.SwingConsole.*;

public class SimpleMenus extends JFrame {
    private JTextField t = new JTextField(15);
    private ActionListener al = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            t.setText(((JMenuItem)e.getSource()).getText());
        }
    };
    private JMenu[] menus = {
            new JMenu("Winken"), new JMenu("Blinken"),
            new JMenu("Nod")
    };
    private JMenuItem[] items = {
            new JMenuItem("Fee"), new JMenuItem("Fi"),
            new JMenuItem("Fo"),  new JMenuItem("Zip"),
            new JMenuItem("Zap"), new JMenuItem("Zot"),
            new JMenuItem("Olly"), new JMenuItem("Oxen"),
            new JMenuItem("Free")
    };
}
