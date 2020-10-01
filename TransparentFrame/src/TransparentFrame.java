import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TransparentFrame extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TransparentFrame frame = new TransparentFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public TransparentFrame() {
        setUndecorated(true);
        setBounds(0, 0, 200, 200);
        setLocationRelativeTo(null);
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(Color.BLUE, 2));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.2f));

    }

}