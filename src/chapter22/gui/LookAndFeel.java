package chapter22.gui;

import javax.swing.*;
import java.awt.*;
import static net.achilles.util.SwingConsole.*;

public class LookAndFeel extends JFrame {
    private String[] choices =
            "Eeny Meeny Minnie Mickey Moe Larry Curly".split(" ");
    private Component[] samples = {
            new JButton("JButton"),
            new JTextField("JTextField"),
            new JLabel("JLabel"),
            new JCheckBox("JCheckBox"),
            new JRadioButton("Radio"),
            new JComboBox(choices),
            new JList(choices),
    };
    public LookAndFeel() {
        super("Look And Feel");
        setLayout(new FlowLayout());
        for(Component component : samples)
            add(component);
    }
    private static void usageError() {
        System.out.println(
                "Usage:LookAndFeel [cross|system|motif]");
        System.exit(1);
    }
    public static void main(String[] args) {
        if(args.length == 0) usageError();
        if(args[0].equals("cross")) {
            try {
                UIManager.setLookAndFeel(UIManager.
                        getCrossPlatformLookAndFeelClassName());
            } catch(Exception e) {
                e.printStackTrace();
            }
        } else if(args[0].equals("system")) {
            try {
                UIManager.setLookAndFeel(UIManager.
                        getSystemLookAndFeelClassName());
            } catch(Exception e) {
                e.printStackTrace();
            }
        } else if(args[0].equals("motif")) {
            try {
                UIManager.setLookAndFeel("com.sun.java."+
                        "swing.plaf.motif.MotifLookAndFeel");
            } catch(Exception e) {
                e.printStackTrace();
            }
        } else usageError();
        run(new LookAndFeel(), 300, 300);
    }
}
