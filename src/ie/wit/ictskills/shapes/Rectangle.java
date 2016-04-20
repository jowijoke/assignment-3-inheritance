package ie.wit.ictskills.shapes;

// TODO Task 1: Refactor: derive from Shapes super class

public class Rectangle extends Shapes
{
  private int xSideLength;
  private int ySideLength;

  public Rectangle()
  { // super(xPosition, yPosition, color, isVisible)
    super(60, 50, "red", false);
    this.xSideLength = 100;
    this.ySideLength = 50;

  }

  public Rectangle(int xSideLength, int ySideLength, int xPosition, int yPosition, String color)
  {
    super(xPosition, yPosition, color, true);
    this.xSideLength = xSideLength;
    this.ySideLength = yPosition;
  }

  @Override
  public void changeSize(int scale)
  {
    if (xSideLength > 0 && ySideLength > 0)
    {
      super.erase();
      this.xSideLength = xSideLength*scale ;
      this.ySideLength = ySideLength*scale;
      draw();
    }
    else
    {
      System.out.println("Enter positive dimensions");
    }

  }

  public void changeColor(String color)
  {
    this.color = color;
    draw();
  }

  @Override
  protected void draw()
  {
    if (isVisible)
    {
      Canvas canvas = Canvas.getCanvas();
      canvas.draw(this, color, new java.awt.Rectangle(xPosition, yPosition, xSideLength, ySideLength));
      canvas.wait(10);
    }
  }
  
  public static void main(String[] args) 
  {
   Rectangle rectangle = new Rectangle();
   rectangle.makeVisible();
    
  }
}