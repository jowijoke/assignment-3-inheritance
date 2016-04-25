package ie.wit.ictskills.shapes;

// TODO Task 4: Complete Ellipse, inherit Shapes, implement Measurable, subclass Circle.
import ie.wit.ictskills.util.ellipse.EllipseMeasure;

import java.awt.geom.*;

/**
 * An ellipse that can be manipulated and that draws itself on a canvas.
 * 
 * @author
 * 
 * @version
 */

public class Ellipse extends Shapes implements Measurable

{
  protected int xdiameter;
  protected int ydiameter;

  public Ellipse()
  { // super(xPosition, yPosition, color, isVisible)
    super(70, 60, "black", false);
    this.xdiameter = 100;
    this.ydiameter = 50;

  }

  public Ellipse(int xdiameter, int ydiameter, int xPosition, int yPosition, String color, boolean isVisible)
  {
    super(xPosition, yPosition, color, true);
    this.xdiameter = xdiameter;
    this.ydiameter = ydiameter;
  }

  @Override
  protected void changeSize(int scale)
  {
    if (xdiameter > 0 && ydiameter > 0)
    {
      super.erase();
      this.xdiameter *= scale;
      this.ydiameter *= scale;
      draw();
    }
    else
    {
      System.out.println("Enter positive dimensions");
    }

  }

  @Override
  protected void draw()
  {
    if (isVisible)
    {
      Canvas canvas = Canvas.getCanvas();
      canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, xdiameter, ydiameter));
      canvas.wait(10);
    }
  }

  @Override
  public double perimeter()
  {
    return EllipseMeasure.perimeter(xdiameter, ydiameter);
  }

}
