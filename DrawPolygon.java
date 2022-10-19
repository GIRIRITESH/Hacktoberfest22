import java.awt.*;
import javax.swing.*;
 
public class DrawPolygon extends JPanel {
 
  public void paintComponent(Graphics g) {
    int [] x = {11,31,41,51,111,141};
    int [] y = {142,112,52,42,32,12};
    g.drawPolygon(x, y,7);
  }
 
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Draw Polygon");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.white);
    frame.setSize(300, 200);
 
    DrawPolygon panel = new DrawPolygon();
 
    frame.add(panel);
 
    frame.setVisible(true);
  }
}
