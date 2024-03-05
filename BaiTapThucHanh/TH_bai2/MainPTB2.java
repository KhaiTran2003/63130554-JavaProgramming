package TH_bai2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainPTB2 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PTB2 frame = new PTB2();
                frame.setTitle("Giải phương trình bậc 2");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack(); 
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
