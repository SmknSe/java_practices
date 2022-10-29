package practice21_22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private ICreateDocument iCreateDocument;

    public Frame(ICreateDocument iCreateDocument){
        super("Frame");
        this.iCreateDocument = iCreateDocument;
        setSize(500,500);
        setVisible(true);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(newItem);
        menu.add(openItem);
        menu.add(saveItem);
        menu.add(exitItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iCreateDocument.CreateNew();
            }
        });

        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iCreateDocument.CreateOpen();
            }
        });
    }
}
