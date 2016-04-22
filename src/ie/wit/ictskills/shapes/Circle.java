package ie.wit.ictskills.shapes;

import java.awt.geom.Ellipse2D;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 * 
 * @author jfitzgerald
 * @version 2016-04-10
 * 
 */

public class Circle extends Ellipse implements Measurable
{
    /**
     * Create a new circle at default position with default color & diameter.
     */
    public Circle()
    {
        // Invokes super class Ellipse with xDiameter & yDiameter == 100 units
        // Default circle positioned at 0,0
        // super(xdiameter, ydiameter, xPosition, yPosition, color, isVisible)
       super(100, 100, 0, 0, "red");
    }

    public Circle (int diameter, int xPosition, int yPosition, String color)
    {
    //    super(xdiameter, ydiameter, xPosition, yPosition, color, true);
    }

    @Override
    public double perimeter() {

        return Math.PI*xdiameter;
    }
    
    
    public static void main(String[] args) 
    {
     Circle circle = new Circle();
     circle.makeVisible();
      
    }
    
}