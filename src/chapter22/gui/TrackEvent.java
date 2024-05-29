package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static net.achilles.util.SwingConsole.*;

public class TrackEvent extends JFrame {
    private HashMap<String,JTextField> h =
            new HashMap<String,JTextField>();
    private String[] event = {
            "focusGained", "focusLost", "keyPressed",
            "keyReleased", "keyTyped", "mouseClicked",
            "mouseEntered", "mouseExited", "mousePressed",
            "mouseReleased", "mouseDragged", "mouseMoved"
    };
    private MyButton
            b1 = new MyButton(Color.BLUE, "test1"),
            b2 = new MyButton(Color.RED, "test2");
}
