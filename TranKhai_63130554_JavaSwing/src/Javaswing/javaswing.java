package Javaswing;

import javax.swing.*;
import java.awt.event.*;

public class javaswing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tuổi của bạn");
        frame.setSize(300, 200);
        JLabel lb_birth = new JLabel("Nhập năm sinh:");
        lb_birth.setBounds(30, 20, 150, 30);
        JTextField txt_year = new JTextField();
        txt_year.setBounds(150, 20, 100, 30);
        JLabel lb_age = new JLabel("Tuổi của bạn là: ");
        lb_age.setBounds(30, 60, 150, 30);
        JButton btn_cal = new JButton("Tính ngay");
        btn_cal.setBounds(100, 100, 150, 30);

        btn_cal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int birthYear = Integer.parseInt(txt_year.getText());
                int currentYear = java.time.Year.now().getValue();
                int age = currentYear - birthYear;   
                lb_age.setText("Tuổi của bạn là: " + age);
            }
        });

        frame.add(lb_birth);
        frame.add(txt_year);
        frame.add(lb_age);
        frame.add(btn_cal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

