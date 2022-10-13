package ru.mirea.task8.task2;

import javax.swing.*;

public class Main extends JFrame {
    Main(String s)
    {
        super("Task");
        setSize(400,500);
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(s);
        jLabel.setIcon(imageIcon);
        add(jLabel);
        setVisible(true);
    }
    public static void main(String []args)
    {
        new Main(args[0]);
    }
}
