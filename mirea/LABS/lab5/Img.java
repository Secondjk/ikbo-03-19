package ru.mirea.labs.lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Img extends JFrame {
    public Img(String href) throws IOException {
        super("ImgView");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BufferedImage pic = ImageIO.read(new File(href));
        JLabel picLabel = new JLabel(new ImageIcon(pic));
        add(picLabel);
        setVisible(true);
        setBounds(0, 0, 800, 600);
    }

    public static void main(String[] args) throws IOException {
        new Img(args.length != 0 ? args[0] : "src/ru/mirea/labs/lab5/cat3.jpg");
    }
}
