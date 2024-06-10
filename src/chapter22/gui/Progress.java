package chapter22.gui;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import static net.achilles.util.SwingConsole.*;

public class Progress extends JFrame {
    private JProgressBar pb = new JProgressBar();
    private ProgressMonitor pm = new ProgressMonitor(
            this, "Monitoring Progress", "Test", 0, 100);
    private JSlider sb =
            new JSlider(JSlider.HORIZONTAL, 0, 100, 60);
}
