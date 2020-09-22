import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog(null,"Enter your first name");
        String lastName = JOptionPane.showInputDialog(null,"Enter your last name");
        JOptionPane.showMessageDialog(null,firstName+lastName,"Name :",-1);
    }
}
