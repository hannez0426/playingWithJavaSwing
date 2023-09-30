import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo extends JFrame{

    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnClick;
public HelloDemo() {
    btnClick.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(btnClick,txtName.getText() + ", Hello");
        }
    });
}

    public static void main(String[] args) {
        HelloDemo hello = new HelloDemo();
        hello.setContentPane(hello.panelMain);
        hello.setTitle("Hello");
        hello.setSize(300,400);
        hello.setVisible(true);
        hello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
