package TH_bai1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {

    private JTextField txt_username;
    private JPasswordField txt_pass;
    private JPanel contentPane;

    public LoginFrame() {
        setTitle("Đăng nhập hệ thống quản lý bán hàng");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        JPanel panel = new JPanel();
        contentPane = new JPanel();

        setContentPane(contentPane);
        JLabel lb_username = new JLabel("Tên đăng nhập:");
        lb_username.setBounds(30, 30, 120, 25); 
        panel.add(lb_username);

        txt_username = new JTextField();
        txt_username.setBounds(150, 30, 120, 25); 
        panel.add(txt_username);

        JLabel passwordLabel = new JLabel("Mật khẩu:");
        panel.add(passwordLabel);

        txt_pass = new JPasswordField();
        panel.add(txt_pass);

        JButton loginButton = new JButton("Đăng nhập");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performLogin();
            }
        });
        panel.add(loginButton);

        getContentPane().add(panel);

        setVisible(true);
    }

    private void performLogin() {
        String username = txt_username.getText();
        String password = new String(txt_pass.getPassword());

        if (username.equals("63CNTT") && password.equals("123")) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại.", "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
        }
    }
}
