package chapter22.gui.jnlp;

import javax.jnlp.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class JnlpFileChooser extends JFrame {
    private JTextField fileName = new JTextField();
    private JButton
            open = new JButton("Open"),
            save = new JButton("Save");
    private JEditorPane ep = new JEditorPane();
    private JScrollPane jsp = new JScrollPane();
    private FileContents fileContents;
    public JnlpFileChooser() {
        JPanel p = new JPanel();
        open.addActionListener(new OpenL());
        p.add(open);
        save.addActionListener(new SaveL());
        p.add(save);
        jsp.getViewport().add(ep);
        add(jsp, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);
        fileName.setEditable(false);
        p = new JPanel();
        p.setLayout(new GridLayout(2,1));
        p.add(fileName);
        add(p, BorderLayout.NORTH);
        ep.setContentType("text");
        save.setEnabled(false);
    }
    class OpenL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            FileOpenService fs = null;
            try {
                fs = (FileOpenService)ServiceManager.lookup(
                        "javax.jnlp.FileOpenService");
            } catch(UnavailableServiceException use) {
                throw new RuntimeException(use);
            }
            if(fs != null) {
                try {
                    fileContents = fs.openFileDialog(".",
                            new String[]{"txt", "*"});
                    if(fileContents == null)
                        return;
                    fileName.setText(fileContents.getName());
                    ep.read(fileContents.getInputStream(), null);
                } catch(Exception exc) {
                    throw new RuntimeException(exc);
                }
                save.setEnabled(true);
            }
        }
    }
}
