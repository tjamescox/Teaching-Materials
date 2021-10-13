// Car, Truck, Motorcycle, Vehicle, Honda Civic, Ford F-150, Helicopter, Tesla CyberTruck
// list these objects in a hierarchical chain

// 1. Vehicle (Main class) - Attributes of Vehicle: boolean hasEngine, int numDoors, String color, int numWheels
// 2. Car, Truck, Motorcycle, Helicopter - Second level of hierarchy 
// 3. Honda Civic, Ford F-150, Tesla CyberTruck - Third level of hierarchy 

public class Vehicle
{
    private boolean hasEngine;
    private int numDoors;
    private String color;
    private int numWheels;

    // constructor 
    public Vehicle(boolean hasEngine, int numDoors, String color, int numWheels)
    {
        this.hasEngine = hasEngine;
        this.numDoors = numDoors;
        this.color = color;
        this.numWheels = numWheels;
    }

    // getters
    public boolean getEngine()
    {
        return this.hasEngine;
    }

    public int getDoors()
    {
        return this.numDoors;
    }

    public String getColor()
    {
        return this.color;
    }

    public int getWheels()
    {
        return this.numWheels;
    }

    // setters
    public void setEngine(boolean hasEngine)
    {
        this.hasEngine = hasEngine;
    }

    public void setDoors(int numDoors)
    {
        this.numDoors = numDoors;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setWheels(int numWheels)
    {
        this.numWheels = numWheels;
    }

    public String toString()
    {
        return "\nDoes vehicle have an engine?: " + this.hasEngine + "\nNumber of Doors: " + 
                this.numDoors + "\nColor of vehicle: " + this.color + "\nNumber of wheels: " + this.numWheels;
    }
}

class Car extends Vehicle
{
    // create attributes for car class
    private String vinNum;

    // constructor
    public Car(String vinNum, boolean hasEngine, int numDoors, String color, int numWheels)
    {
        super(hasEngine, numDoors, color, numWheels);
        this.vinNum = vinNum;
    }

    // getters
    public String getVin()
    {
        return this.vinNum;
    }

    // setters
    public void setVin(String vinNum)
    {
        this.vinNum = vinNum;
    }

    public String toString()
    {
        return "\nVehicle vin number: " + this.vinNum + "\nDoes vehicle have an engine?: " + getEngine() + "\nNumber of Doors: " + 
                getDoors() + "\nColor of vehicle: " + getColor() + "\nNumber of wheels: " + getWheels();
    }
}