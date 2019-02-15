import java.util.*;
public class print_shape
{


  public void removeElement(Object[] arr, int removedIdx) {
      System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
  }



  public static void main(String args[])
  {

    //generate shapes circle, triangle, and square
    Shape circle = new Shape();
    circle.name = "Circle";
    circle.num_sides = 1;

    Shape triangle = new Shape();
    triangle.name = "Triangle";
    triangle.num_sides = 3;

    Shape square = new Shape();
    square.name = "Square";
    square.num_sides = 4;

    int new_index = 0;
    ArrayList<Shape> shapes = new ArrayList();
    shapes.add(circle);
    shapes.add(triangle);
    shapes.add(square);

    ArrayList<Shape> final_shapes = new ArrayList();

    //order array from most number of sides to least

    for (int j = 0; j < shapes.size() + 2; j++)
    {


      int max_sides = -1;
      Shape shape_to_use = null;
      for (int i = 0; i < shapes.size(); i++)
      {
        Shape temp = shapes.get(i);
        //System.out.println(temp.name);
        if (temp.num_sides > max_sides)
        {
          max_sides = temp.num_sides;
          shape_to_use = temp;
        }
      }
      final_shapes.add(shape_to_use);
      //System.out.println("Adding " + shape_to_use.name);
      shapes.remove(shape_to_use);
    }



    for (int j = 0; j < final_shapes.size(); j++)
    {
      final_shapes.get(j);
      Shape temp = final_shapes.get(j);
      //System.out.println(temp.display_self);
      temp.display_self();

    }
    // System.out.println(max_sides + " " + shape_to_use.name);




  }

}
