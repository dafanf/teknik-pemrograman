/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author DAFA N.F
 */
public class TestCylinder { // save as "TestCylinder.java"
 public static void main (String[] args) {
 // Declare and allocate a new instance of cylinder
 // with default color, radius, and height
 Cylinder c1 = new Cylinder();
 System.out.println("Cylinder:"
 + " radius=" + c1.getRadius()
 + " height=" + c1.getHeight()
 + " base area=" + c1.getArea()
 + " volume=" + c1.getVolume());

 // Declare and allocate a new instance of cylinder
 // specifying height, with default color and radius
 Cylinder c2 = new Cylinder(10.0);
 System.out.println("Cylinder:"
 + " radius=" + c2.getRadius()
 + " height=" + c2.getHeight()
 + " base area=" + c2.getArea()
 + " volume=" + c2.getVolume());

 // Declare and allocate a new instance of cylinder
 // specifying radius and height, with default color
 Cylinder c3 = new Cylinder(2.0, 10.0);
 System.out.println("Cylinder:"
 + " radius=" + c3.getRadius()
 + " height=" + c3.getHeight()
 + " base area=" + c3.getArea()
 + " volume=" + c3.getVolume());
     System.out.println(c1.toString());
     System.out.println(c2.toString());
     System.out.println(c3.toString());
}
}

