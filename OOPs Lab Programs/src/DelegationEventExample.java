import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class DelegationEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Delegation Event Example");
        JButton button = new JButton("Click Me..");

        button.setBounds(100, 100, 150, 50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    System.out.println("Button Clicked!!");
                }
            }
        });

        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}