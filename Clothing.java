public class Clothing{
   //define attributes
   // Variables: they are named memory locations, of a certain data type
   private String color;
   private String displayName;
   private double price; 
   
   
   // constructor: takes instance variables and stores into variable locations to create objects
   public Clothing(String color, String displayName, double price) // instance variables: tells computer whether the values are String, double, etc.
   {
      this.color = color;
      this.displayName = displayName; 
      this.price = price;
      
   }
   
   // getters (accessors):  returning the data that is stored in our variables
   public String getColor()
   {
      return this.color;   
   }

   public String getDisplayName()
   {
      return this.displayName;
   }

   public double getPrice()
   {
      return this.price;
   }  

   // setters (mutatuors):  takes the value of a variable and changes it
   public void setColor(String color)
   {
      this.color = color;
   }

   public void setName(String displayName)
   {
      this.displayName = displayName;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   // toString method: way of displaying all the values of an object
   public String toString()
   {
       return "\nColor: " + this.color + "\nName: " + this.displayName + "\nPrice: $" + this.price;
   }



} // end of clothing class

class Sweatshirt extends Clothing 
{
   //attributes
   private String size;
   private String brand; 

   //constructor
   public Sweatshirt(String size, String brand, String color, String displayName, double price)
   {
      super(color, displayName, price);
      this.size = size;
      this.brand = brand;
   }

   public String getSize()
   {
      return this.size; 
   }
 
   public String getBrand()
   {
      return this.brand;
   }

   //setters
   public void setSize(String size)
   {
      this.size = size;
   }

   public void setBrand(String brand)
   {
      this.brand = brand;
   }

   public String toString()
   {
      return "\nColor: " + getColor() + "\nName: " + getDisplayName() + "\nPrice: $" + getPrice() + "\nSweatshirt Size: " + this.size + "\nBrand: " + this.brand;
      
   }

}
   
   
   
   
   