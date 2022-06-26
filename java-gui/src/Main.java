import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    @Override
//    Java class the paintComponent method when it needs to.
    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.drawOval(0,0,200,200);

        ImageIcon img = new ImageIcon("ashi.jpg");
        img.paintIcon(null,g,150,150);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.setContentPane(new Main());
        window.setVisible(true);
    }
}
