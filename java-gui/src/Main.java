import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        g.drawString("Hello World", 100,100);
    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.setContentPane(new Main());
        window.setVisible(true);
    }
}
