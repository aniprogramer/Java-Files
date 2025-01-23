import java.awt.event.*;
import javax.swing.JFrame;

public class KeyEventSimulation extends JFrame implements KeyListener {
    public KeyEventSimulation() {
        setTitle("Key Event Simulation");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }
    @Override
    public void keyPressed(KeyEvent ke) {
        System.out.println("Key Pressed: " + ke.getKeyCode());
    }
    @Override
    public void keyTyped(KeyEvent ke) {
        System.out.println("Key Typed: " + ke.getKeyChar());
    }
    @Override
    public void keyReleased(KeyEvent ke) {
        System.out.println("Key Released: " + ke.getKeyCode());
    }

    public static void main(String[] args) {
        new KeyEventSimulation();
    }
}
