package chapter22.gui.bangbean;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static net.achilles.util.SwingConsole.*;

public class BangBeanTest extends JFrame {
    private JTextField txt = new JTextField(20);
    class BBL implements ActionListener {
        private int count = 0;
        public void actionPerformed(ActionEvent e) {
            txt.setText("BangBean action "+ count++);
        }
    }
}