package TH_bai2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PTB2 extends JFrame {

    private JLabel lblTitle, lblA, lblB, lblC, lblResult;
    private JTextField txtA, txtB, txtC;
    private JButton btnSolve;

    public PTB2() {
    	 setTitle("Giải Phương Trình Bậc 2");
         setSize(300, 200);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocation(800, 600); // Đặt vị trí cửa sổ

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5));

        lblTitle = new JLabel("Nhập các hệ số của phương trình ax^2 + bx + c = 0");
        panel.add(lblTitle);
        panel.add(new JLabel());

        lblA = new JLabel("Hệ số a:");
        panel.add(lblA);
        txtA = new JTextField();
        panel.add(txtA);

        lblB = new JLabel("Hệ số b:");
        panel.add(lblB);
        txtB = new JTextField();
        panel.add(txtB);

        lblC = new JLabel("Hệ số c:");
        panel.add(lblC);
        txtC = new JTextField();
        panel.add(txtC);

        panel.add(new JLabel());
        btnSolve = new JButton("Giải");
        btnSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveEquation();
            }
        });
        panel.add(btnSolve);

        lblResult = new JLabel();
        panel.add(lblResult);

        getContentPane().add(panel);
        setVisible(true);
    }

    private void solveEquation() {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = Double.parseDouble(txtC.getText());

            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                lblResult.setText("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                lblResult.setText("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                lblResult.setText("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            }
        } catch (NumberFormatException ex) {
            lblResult.setText("Vui lòng nhập số hợp lệ cho các hệ số a, b, c");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PTB2();
            }
        });
    }
}
