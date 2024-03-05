package TH_bai0;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ManHinhTinhToan extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtSoA;
    private JTextField txtSoB;
    private JLabel lblResult;

    public ManHinhTinhToan() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNumber1 = new JLabel("Nhập số a:");
        lblNumber1.setBounds(50, 30, 80, 20);
        contentPane.add(lblNumber1);

        txtSoA = new JTextField();
        txtSoA.setBounds(140, 30, 100, 20);
        contentPane.add(txtSoA);
        txtSoA.setColumns(10);

        JLabel lblNumber2 = new JLabel("Nhập số b:");
        lblNumber2.setBounds(50, 60, 80, 20);
        contentPane.add(lblNumber2);

        txtSoB = new JTextField();
        txtSoB.setBounds(140, 60, 100, 20);
        contentPane.add(txtSoB);
        txtSoB.setColumns(10);

        JButton btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('+');
            }
        });
        btnAdd.setBounds(50, 90, 50, 30);
        contentPane.add(btnAdd);

        JButton btnSubtract = new JButton("-");
        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('-');
            }
        });
        btnSubtract.setBounds(110, 90, 50, 30);
        contentPane.add(btnSubtract);

        JButton btnMultiply = new JButton("*");
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('*');
            }
        });
        btnMultiply.setBounds(170, 90, 50, 30);
        contentPane.add(btnMultiply);

        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('/');
            }
        });
        btnDivide.setBounds(230, 90, 50, 30);
        contentPane.add(btnDivide);

        lblResult = new JLabel("Kết quả: ");
        lblResult.setBounds(50, 130, 200, 20);
        contentPane.add(lblResult);
    }

    private void performOperation(char operation) {
        try {
            double soA = Double.parseDouble(txtSoA.getText());
            double soB = Double.parseDouble(txtSoB.getText());
            double result = 0;

            switch (operation) {
                case '+':
                    result = soA + soB;
                    break;
                case '-':
                    result = soA - soB;
                    break;
                case '*':
                    result = soA * soB;
                    break;
                case '/':
                    if (soB != 0)
                        result = soA / soB;
                    else
                        lblResult.setText("Cannot divide by zero");
                    break;
                default:
                    lblResult.setText("Invalid operation");
            }

            lblResult.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            lblResult.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ManHinhTinhToan frame = new ManHinhTinhToan();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

