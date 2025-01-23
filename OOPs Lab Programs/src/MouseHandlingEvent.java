import java.awt.event.*;
import javax.swing.JFrame;

public class MouseHandlingEvent extends JFrame implements MouseListener {
    public MouseHandlingEvent() {
        setTitle("Mouse Handling Event");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setFocusable(true);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Mouse Clicked: ("+ me.getX()+","+me.getY()+")");
    }
    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Mouse Pressed: ("+ me.getX()+","+me.getY()+")");
    }
    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Mouse Released: ("+ me.getX()+","+me.getY()+")");
    }
    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Mouse Entered");
    }
    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Mouse Exited!!");
    }

    public static void main(String[] args) {
        new MouseHandlingEvent();
    }
}
