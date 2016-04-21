package ie.wit.ictskills.shapes;

import java.util.ArrayList;

public class TestPentagon {

	public static void main(String[] args) 
	{
	// TODO Task 3: Display 4 cascaded Pentagons differently colored shapes. 
	  ArrayList<Shapes> pentagon = new ArrayList<>();
	  pentagon.add(new Pentagon(40, 40, 80, "red"));
	  pentagon.add(new Pentagon(50, 70, 100, "blue"));
    pentagon.add(new Pentagon(60, 110, 120, "green"));
    pentagon.add(new Pentagon(70, 150, 140, "black"));
    
    for(Shapes pentagons : pentagon)
    {
      pentagons.makeVisible();
    }

	}

}
