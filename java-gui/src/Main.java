import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    @Override
//    Java class the paintComponent method when it needs to.
    public void paintComponent(Graphics g){
//        g.setColor(Color.GREEN);
//        g.drawLine(100,100,400,400);
//        g.setColor(Color.red);
//        g.drawRect(100,100,200,200);
//        g.fillRect(10,10,50,50);
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.BLACK);
        g.fillRect(0,0,width,height);
//        g.fillRect(0,0,300,300); 如果是打這樣 會變成拖拉視窗的時候不會重新執行 paintComponent

        g.setColor(Color.GREEN);
        g.drawLine(10,10,50,50);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.setContentPane(new Main());
        window.setVisible(true);
    }
}
