package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.achilles.util.SwingConsole.*;

class MyDialog extends JDialog {
    public MyDialog(JFrame parent) {
        super(parent, "My dialog", true);
        setLayout(new FlowLayout());
        add(new JLabel("Here is my dialog"));
        JButton ok = new JButton("OK");
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(ok);
        setSize(150,125);
    }
}

public class Dialogs extends JFrame {
}
