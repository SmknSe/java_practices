package practice9.UI;

import practice9.Data;
import practice9.Students.SortingStudentsByGPA;
import practice9.Students.Student;
import practice9.Students.StudentController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class StudentUI {
    JLabel NameLbl = new JLabel("Введите имя:");
    JTextField NameInput = new JTextField(20);

    JLabel SNameLbl = new JLabel("Введите фамилию:");
    JTextField SNameInput = new JTextField(20);

    JLabel InnLbl = new JLabel("Введите ИНН:");
    JTextField InnInput = new JTextField(20);

    JButton btn = new JButton("Сортировка");

    String INN="",name="",sname="";

    public StudentUI(JFrame window) {
        window.add(InnLbl);
        window.add(InnInput);
        InnInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                INN = InnInput.getText();
                System.out.println(StudentController.check(INN));
            }
        });

        window.add(NameLbl);
        window.add(NameInput);
        NameInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = NameInput.getText();
                sname = SNameInput.getText();
                System.out.println(StudentController.search(new Student(name,sname)));
            }
        });

        window.add(SNameLbl);
        window.add(SNameInput);
        SNameInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = NameInput.getText();
                sname = SNameInput.getText();
                System.out.println(StudentController.search(new Student(name,sname)));
            }
        });

        window.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Student> ar = Data.getStudents();
                ar.sort(new SortingStudentsByGPA());
                System.out.println(ar);
            }
        });
    }
}
