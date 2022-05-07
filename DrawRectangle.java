import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawRectangle extends JPanel
{
  public static void main(String[] a)
  {
    JFrame r = new JFrame();
    r.setSize(400, 400);
    r.add(new DrawRectangle());
    r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    r.setVisible(true);
  }

  public void paint(Graphics g)
  {
    g.drawRect(5, 15, 100, 75);
  }
}