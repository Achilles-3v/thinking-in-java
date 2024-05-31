package chapter22.gui;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import static net.achilles.util.SwingConsole.*;

public class TextFields extends JFrame {
    private JButton
            b1 = new JButton("Get Text"),
            b2 = new JButton("Set Text");
    private JTextField
            t1 = new JTextField(30),
            t2 = new JTextField(30),
            t3 = new JTextField(30);
    private String s = "";
    private UpperCaseDocument ucd = new UpperCaseDocument();
}

class UpperCaseDocument extends PlainDocument {
    private boolean upperCase = true;
    public void setUpperCase(boolean flag) {
        upperCase = flag;
    }
    public void
    insertString(int offset, String str, AttributeSet attSet)
            throws BadLocationException {
        if(upperCase) str = str.toUpperCase();
        super.insertString(offset, str, attSet);
    }
}
