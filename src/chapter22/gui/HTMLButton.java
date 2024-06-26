package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.achilles.util.SwingConsole.*;

public class HTMLButton extends JFrame {
    private JButton b = new JButton(
            "<html><b><font size=+2>" +
                    "<center>Hello!<br><i>Press me now!");
    public HTMLButton() {
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add(new JLabel("<html>" +
                        "<i><font size=+4>Kapow!"));
                validate();
            }
        });
        setLayout(new FlowLayout());
        add(b);
    }
    public static void main(String[] args) {
        run(new HTMLButton(), 200, 500);
    }
}
