package ru.mirea.labs.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessRandom extends JFrame {
    private int attempsCount = 0;
    private int number;

    public GuessRandom() {
        number = new Random().nextInt(21);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField guessInput = new JTextField(10);

        JButton guessBtn = new JButton("Играть!");
        guessBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(guessInput.getText());
                if (guess == number) {
                    JOptionPane.showMessageDialog(null, "Вы угадали число!");
                    dispose();
                    System.exit(0);
                }

                attempsCount += 1;

                if (attempsCount == 3) {
                    JOptionPane.showMessageDialog(null, "Число не угадано, игра окончена.");
                    dispose();
                    System.exit(0);
                }

                if (guess > number) {
                    JOptionPane.showMessageDialog(null, "Введенное число больше загаданного!");
                } else {
                    JOptionPane.showMessageDialog(null, "Введенное число меньше загаданного!");
                }

                guessInput.setText("");
            }
        });

        add(guessInput);
        add(guessBtn);

        setLayout(new FlowLayout());
        setVisible(true);
        setBounds(0, 0, 200, 100);
    }

    public static void main(String[] args) {
        new GuessRandom();
    }
}
