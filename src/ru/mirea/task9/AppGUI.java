package ru.mirea.task9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
import java.util.concurrent.TimeUnit;

public class AppGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Матч");
        frame.setSize(500,350);
        frame.setVisible(true);
        frame.setLayout(null);

        JButton madridButton = new JButton("Мадрид");
        madridButton.setBounds(100,180,85,25);
        frame.add(madridButton);

        JButton milanButton = new JButton("Милан");
        milanButton.setBounds(300,180,85,25);
        frame.add(milanButton);

        final int[] madridScore = {0};
        final int[] milanScore = {0};
        JLabel scoreLabel = new JLabel("Result: " + madridScore[0] + " x " + milanScore[0]);
        scoreLabel.setSize(200, 100);
        scoreLabel.setBounds(210, 120, 85, 25);
        frame.add(scoreLabel);

        JLabel lastGoalLabel = new JLabel("Last scorer: ");
        lastGoalLabel.setSize(200, 100);
        lastGoalLabel.setBounds(190, 140, 150, 25);
        frame.add(lastGoalLabel);

        JLabel winnerLabel = new JLabel("Winner: ");
        winnerLabel.setSize(200, 100);
        winnerLabel.setBounds(220, 100, 100, 25);
        frame.add(winnerLabel);

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                madridScore[0]+=1;
                scoreLabel.setText("Result: " + madridScore[0] + " x " + milanScore[0]);
                lastGoalLabel.setText("Last scorer: Мадрид");
                if (madridScore[0] > 9){
                    winnerLabel.setText("Winner: Мадрид");
                }
            }
        });

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreLabel.setText("Result: " + madridScore[0] + " x " + ++milanScore[0]);
                lastGoalLabel.setText("Last scorer: Милан");
                if (milanScore[0] > 9){
                    winnerLabel.setText("Winner: Милан");
                }

            }
        });
    }
}
