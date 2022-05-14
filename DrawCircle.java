import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame
{
  public DrawCircle()
  {
    setTitle("Draw circle");
    setSize(500, 500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void paint(Graphics g)
  {
    Graphics2D g2d = (Graphics2D) g;
    g2d.drawOval(150, 150, 100, 100);
  }

  public static void main(String[] args)
  {
    new DrawCircle();
  }
}