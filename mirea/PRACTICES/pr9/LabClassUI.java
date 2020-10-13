package ru.mirea.practices.pr9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI extends JFrame {
    public LabClassUI(LabClass studentsClass) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton addStudentBtn = new JButton("Найти студента");
        JTextField studentNameField = new JTextField(12);
        JButton findButton = new JButton("Найти");
        addStudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentNameField.setBounds(180, 20, 100, 30);
                findButton.setBounds(180, 60, 100, 30);
                add(findButton);
                add(studentNameField);
                repaint();
            }
        });

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Student foundStudent = studentsClass.find(studentNameField.getText());
                    JOptionPane.showMessageDialog(null, foundStudent, "Окно поиска",
                        JOptionPane.INFORMATION_MESSAGE);
                } catch (StudentNotFoundException studentNotFoundException) {
                    JOptionPane.showMessageDialog(null, "Студент не найден!",
                        "Информация", JOptionPane.ERROR_MESSAGE);
                }

                remove(studentNameField);
                remove(findButton);
                repaint();
            }
        });
        addStudentBtn.setBounds(20, 20,140,40);
        add(addStudentBtn);

        JButton sortBtn = new JButton("Сортировать по оценкам");
        sortBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentsClass.sortByScore();
            }
        });
        sortBtn.setBounds(20, 80,140,40);
        add(sortBtn);

        JButton printBtn = new JButton("Показать список студентов");
        printBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder result = new StringBuilder();
                studentsClass.getList()
                    .forEach(student -> result.append(student.getName() + '\n'));
                System.out.println(studentsClass.toString());
                JOptionPane.showMessageDialog(null, result, "Список студентов",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });
        printBtn.setBounds(20, 140,140, 40);
        add(printBtn);

        setSize(400, 300);
        setVisible(true);
    }
}
