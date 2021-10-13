// create shape objects

public class Shapes1
{
    // attributes 
    // private indicator means data is "hidden" (AKA data hiding)
    private int numSides;
    private String name;

    // Constructor method: "constructs" object ---> initialized object in main method
    // Without constuctor method, cannot create Shapes1 objects
    public Shapes1(int numSides, String name)
    {
        this.numSides = numSides; // this.numSides is memory location and numSides is instance variable
        this.name = name;
    }

    // getters (accessors): they "get" data and return for the user
    public int getSides()
    {
        return this.numSides;
    }

    public String getName()
    {
        return this.name;
    }

    // setters (mutators): goes to variable memory location and changes value
    public void setSides(int numSides)
    {
        this.numSides = numSides;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}