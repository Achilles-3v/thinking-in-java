package chapter22.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import static net.achilles.util.SwingConsole.*;

public class Borders extends JFrame {
    static JPanel showBorder(Border b) {
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        String nm = b.getClass().toString();
        nm = nm.substring(nm.lastIndexOf('.') + 1);
        jp.add(new JLabel(nm, JLabel.CENTER),
                BorderLayout.CENTER);
        jp.setBorder(b);
        return jp;
    }
}
