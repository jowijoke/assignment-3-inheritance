package ie.wit.ictskills.shapes;

// TODO Task 2: Complete Pentagon class
import java.awt.Polygon;

/**
 * @file Pentagon.java
 * @brief This class describes a pentagon and has behaviour to display, resize
 *        and move objects
 * 
 * @author jfitzgerald 2014-05-23
 * 
 */
public class Pentagon extends Shapes implements Measurable
{
  private int radius;// radius of circumscribing circle
  boolean isVisible = true;

  public Pentagon()
  { // super(xPosition, yPosition, color, isVisible)
    super(0, 0, "black", false);
    this.radius = 50;
  }

  public Pentagon(int radius, int xPosition, int yPosition, String color)
  {
    super(xPosition, yPosition, color, true);
    this.radius = radius;
  }

  @Override
  public void changeSize(int scale)
  {
    this.radius *= scale;
  }

  @Override
  protected void draw()
  {
    if (isVisible)
    {
      // Ref: http://mathworld.wolfram.com/Pentagon.html
      double dc1 = 0.25 * (Math.sqrt(5) - 1);
      double dc2 = 0.25 * (Math.sqrt(5) + 1);
      double ds1 = 0.25 * (Math.sqrt(10 + 2 * Math.sqrt(5)));
      double ds2 = 0.25 * (Math.sqrt(10 - 2 * Math.sqrt(5)));// length of
                                                             // pentagon side is
                                                             // 2*ds2
      int c1 = -(int) (radius * dc1);// radius of circle that circumscribes
                                     // pentagon
      int c2 = -(int) (radius * dc2);
      int s1 = (int) (radius * ds1);
      int s2 = (int) (radius * ds2);

      Canvas canvas = Canvas.getCanvas();
      int[] xpoints = { xPosition, xPosition + s1, xPosition + s2, xPosition - s2, xPosition - s1 };
      int[] ypoints = { yPosition - radius, yPosition + c1, yPosition - c2, yPosition - c2, yPosition + c1 };
      canvas.draw(this, color, new Polygon(xpoints, ypoints, 5));
      canvas.wait(10);
    }
  }

  @Override
  public double perimeter()
  {
    return 10 * radius * Math.sin(Math.PI / 5);
  }

  public static void main(String[] args)
  {
    Pentagon p = new Pentagon();
    p.makeVisible();

  }
}
