package ru.mirea.practices.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SportScore extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    public SportScore() {
        super("Example");
        setLayout(new GridLayout(2, 3));

        JPanel[] panels = new JPanel[6];

        for (int i = 0; i < panels.length; ++i) {
            panels[i] = new JPanel();
            panels[i].setLayout(new BorderLayout());
            add(panels[i]);
        }

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        JLabel resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        JLabel scorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        JLabel winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        milanButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore += 1;

                resultLabel.setText("Result: " + milanScore + " X " + madridScore);
                scorerLabel.setText("Last Scorer: AC Milan");
                winnerLabel.setText("Winner: " + getWinner());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        madridButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madridScore += 1;

                resultLabel.setText("Result: " + milanScore + " X " + madridScore);
                scorerLabel.setText("Last Scorer: Real Madrid");
                winnerLabel.setText("Winner: " + getWinner());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        panels[1].add(resultLabel, BorderLayout.NORTH);
        panels[1].add(scorerLabel, BorderLayout.CENTER);
        panels[3].add(milanButton);
        panels[4].add(winnerLabel, BorderLayout.CENTER);
        panels[5].add(madridButton);

        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private String getWinner() {
        if (milanScore == madridScore) {
            return "DRAW";
        }

        return milanScore > madridScore ? "AC Madrid" : "Real Madrid";
    }

    public static void main(String[] args) {
        new SportScore().setVisible(true);
    }
}
