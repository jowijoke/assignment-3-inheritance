package ie.wit.ictskills.shapes;

// TODO Task 1: Refactor: derive from Shapes super class
import java.awt.Polygon;
public class Rectangle extends Shapes
{
    private int xSideLength;
    private int ySideLength;

    public Rectangle()
    {	//super(xPosition, yPosition, color, isVisible)
       super(60, 50, "red", false);
       	this.xSideLength = 60;
       this.ySideLength = 30;
         
    }

    public Rectangle(int xSideLength, int ySideLength, int xPosition, int yPosition, String color)
    {
        super (xPosition, yPosition, color, true);
    	this.xSideLength = xSideLength;
    	this.ySideLength = yPosition;
    }

    public void changeSize(int scale)
    {
        if(xSideLength > 0 && ySideLength > 0) 
        {
            erase();
            this.xSideLength = xSideLength;
            this.ySideLength = ySideLength;
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

    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                    new java.awt.Rectangle(xPosition, yPosition, xSideLength, ySideLength));
            canvas.wait(10);
        }
    }

    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void changeSize(int scale) {
		// TODO Auto-generated method stub
		
	}
}