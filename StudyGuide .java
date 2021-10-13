// Inheritence:  Family of data types (classes) that are related to each but not exactly the same things
// Classes have "is a" relationship (Car is a vehicle)
// Let's say we have Animal, Bulldog, Fish, Mammal, Maincoone Cat, Bird classes (List them by their heirarchy)
// 1. Animal
// 2. Mammal, Fish, Bird
// 3. Bulldog, Maincoone Cat

public class Animal
{
    // Start with attributes
    private String name;
    private String location;

    // Constructor: method for creating the class object (in this case an Animal object)
    public Animal(String name, String location)
    {
        this.name = name;
        this.location = location;
    }

    // getters (accessors)
    public String getLocation()
    {
        return this.location;
    }

    public String getName()
    {
        return this.name;
    }

    // setters (mutators)
    public void setLocation(String location)
    {
        this.location = location;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // toString
    public String toString()
    {
        return "\nName: " + this.name + "\nLocation: " + this.location;
    }
}

class Fish extends Animal
{
    // attributes
    private Boolean hasGils;

    // constructor method
    public Fish(Boolean hasGils, String name, String location)
    {
        super(name, location);
        this.hasGils = hasGils;
    }

    // getters
    public Boolean getGils()
    {
        return this.hasGils;
    }

    // setter
    public void setGils(Boolean hasGils)
    {
        this.hasGils = hasGils;
    }

    // toString
    public String toString()
    {
        return "\nName: " + getName() + "\nLocation: " + getLocation() + "\nGils: " + this.hasGils;
    }
}

// Polymorphism: Let's us store multiple different objects together
Animal a1 = new Animal("Penguin", "Antartica"); 
Fish f1 = new Fish(true, "Catfish", "Georgia");

Animal[] array = {a1, f1}; // <--- only reason we can store these two diffent types of data together is Inheritence/Polymorphism

// better example of Polymorphism
Animal a2 = new Animal("Lion", "Africa");
Animal f2 = new Fish(true, "Bass", "USA");

// Interfaces: is a list of method headers, where classes implement the interface and override these methods
public interface Shapes
{
    public int getArea(int length, int width);
    public int getPerimeter(int length, int width);
}

class Square implements Shapes
{
    public int getArea(int length, int width)
    {
        area = length * width;
        return area;
    }

    public int getPerimeter(int length, int width)
    {
        perimeter = (2*lenght) + (2*width);
        return perimeter;
    }
}

// Wrapper Classes: class that "wraps" around primitive data type to make it look like an object
// These wrapper classes bring new methods to the primitive data types

// Primitive Data type                             Wrapper Class Data type
//      int                                               Integer                   Integer i = 2;
//      char                                              Character
//      double                                            Double
//      boolean                                           Boolean


// Abstract Classes: very similar to interfaces, but classes instead of interface
abstract class Shape
{
    abstract void message();
}

class Triangle extends Shape
{
    void message()
    {
        System.out.println("Shape is a triangle");
    }
}

// Overriding vs. OverLoading
// Overridden method:  same method name and same parameters
public class Triangle
{
    public String toString()
    {
        return .........  ;
    }
}
                                    // toString methods are overriden methods
class Square
{
    public String toString()
    {
        return .........  ;
    }
}

// OverLoading method:  same method name but different parameters
public class Dog
{
    public void bark()
    {
        System.out.println("Woof");
    }

    public void bark(int numBarks)
    {
        for(int i = 0; i < numBarks; i++)
        {
            System.out.println("Woof ");
        }
    }
}