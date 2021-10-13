public class Triangle
{
   private double base;
   private double height;  
   // add side1 and side2 variables

//Constructors
   public Triangle()
   {
      this.(0,0);
   }
   
   public Triangle(double base, double height) // <---- add side1 and side2 to parameters
   {
      this.base = base;
      this.height = height; // <---- add this.side1 = side1 and this.side2 = side2
   }


//Getters and Setters

   public double getSide1()
   {
      return side1;
   }

   public void setSide1(double side1)
   {
      this.side1 = side1;
   }

   public double getSide2()
   {
      return side2;
   }

   public void setSide2(double side2)
   {
      this.side2 = side2;
   }
   
   public double getSide3() // <--- side3 can be base instead...  The base is a side of the triangle
   {
      return side3;
   }
   
   public void setSide3(double side3) // <--- same here, base instead of side3
   {
      this.side3 = side3;
   }

   // create getter and setter for your height variable

// Behaviors
   public double getArea() // use variables to find area...  Put base and height in parameters use them to find area
   {
      
   }
   
   public void printDiameter() // put side1, side2, and base in parameters...  use them to find diameter
   {
      System.out.println(diameter+" is the Diameter");
   }



}