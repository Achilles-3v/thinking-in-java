package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.achilles.util.SwingConsole.*;

public class TicTacToe extends JFrame {
    private JTextField
            rows = new JTextField("3"),
            cols = new JTextField("3");
    private enum State { BLANK, XX, OO }
}
