package ie.wit.ictskills.shapes;

/**
 * An abstract class describing geometric shapes
 * 
 * @author jfitzgerald
 * @version 2016-04-12
 */
public abstract class Shapes
{
  int xPosition;
  int yPosition;
  String color;
  boolean isVisible;

  public Shapes()
  {

  }

  public Shapes(int xPosition, int yPosition, String color, boolean isVisible)
  {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.color = color;
    this.isVisible = isVisible;
  }

  abstract void draw();

  abstract void changeSize(int scale);

  public void makeVisible()
  {
    isVisible = true;
    draw();
  }

  public void makeInvisible()
  {
    erase();
    isVisible = false;
  }

  /**
   * Move the triangle to new position whose coordinates in pixels will be (x,
   * y).
   * 
   * @param x
   *          the new x coordinate
   * @param y
   *          the new y coordinate
   */
  public void moveTo(int x, int y)
  {
    xPosition = x;
    yPosition = y;
  }

  public void moveRight()
  {
    moveHorizontal(20);
  }

  public void moveLeft()
  {
    moveHorizontal(-20);
  }

  public void moveUp()
  {
    moveVertical(-20);
  }

  public void moveDown()
  {
    moveVertical(20);
  }

  public void moveHorizontal(int distance)
  {
    erase();
    xPosition += distance;
    draw();
  }

  public void moveVertical(int distance)
  {
    erase();
    yPosition += distance;
    draw();
  }

  public void changeColor(String color)
  {
    this.color = color;
    draw();
  }

  protected void erase()
  {
    if (isVisible)
    {
      Canvas canvas = Canvas.getCanvas();
      canvas.erase(this);
    }
  }

}
