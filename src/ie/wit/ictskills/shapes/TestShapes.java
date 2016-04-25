package ie.wit.ictskills.shapes;

import java.util.ArrayList;

// TODO Task 7: Refactor TestShapes
public class TestShapes
{
  public static void main(String[] args)
  {
    ArrayList<Shapes> shapes = new ArrayList<>();

    shapes.add(new Circle(30, 30, 20, 60, "red"));
    shapes.add(new Circle(40, 40, 30, 70, "blue"));
    shapes.add(new Circle(50, 50, 40, 80, "green"));
    shapes.add(new Circle(60, 60, 50, 90, "black"));

    shapes.add(new Triangle(30, 40, 160, 50, "red"));
    shapes.add(new Triangle(40, 50, 170, 60, "blue"));
    shapes.add(new Triangle(50, 60, 180, 70, "green"));
    shapes.add(new Triangle(60, 70, 190, 80, "black"));

    shapes.add(new Rectangle(150, 50, 60, 150, "red"));
    shapes.add(new Rectangle(150, 60, 70, 160, "blue"));
    shapes.add(new Rectangle(150, 70, 80, 170, "green"));
    shapes.add(new Rectangle(150, 80, 90, 180, "black"));

    for (Shapes shape : shapes)
    {
      shape.makeVisible();
    }
  }
}
