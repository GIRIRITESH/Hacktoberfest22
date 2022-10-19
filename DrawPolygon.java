import java.awt.*;
import javax.swing.*;
 
public class DrawPolygon extends JPanel {
 
  public void paintComponent(Graphics g) {
    int [] x = {10,30,40,50,110,140};
    int [] y = {140,110,50,40,30,10};
    g.drawPolygon(x, y, 6);
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