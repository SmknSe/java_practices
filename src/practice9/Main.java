package practice9;

import practice9.UI.StudentUI;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        super("Task9");
        setLayout(new FlowLayout());
        setSize(1000,500);
        new StudentUI(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Data();
        new Main();
    }
}
