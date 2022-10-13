package ru.mirea.task8.task3;

import javax.swing.*;

public class Main extends JFrame {
    Main() {
        super("Task");
        setSize(400,370);
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon("D:\\Downloads\\camel-acegif-20-running-camel.gif");
        jLabel.setIcon(imageIcon);
        add(jLabel);
        setVisible(true);
    }
    public static void main(String []args)
    {
        new Main();
    }

}
