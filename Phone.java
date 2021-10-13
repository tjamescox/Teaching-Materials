// Create a phone class to create phone objects
// Author: Tanner Cox

public class Phone
{
    // allocate memory for object attributes
    private String phoneNum;  // xxx-xxx-xxxx
    private String brand;
    private String serialNum;
    private int storage;
    
    // create our constructor
    public Phone(String phoneNum, String brand, String serialNum, int storage)
    {
        this.phoneNum = phoneNum;
        this.brand = brand;
        this.serialNum = serialNum;
        this.storage = storage;
    }

    // create getters (Accessors)
    public String getPhone()
    {
        return this.phoneNum;
    }

    public String getBrand()
    {
        return this.brand;
    }

    public String getSerial()
    {
        return this.serialNum;
    }

    public int getStorage()
    {
        return this.storage;
    }

    // create setters (Mutators)
    public void setPhone(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setSerial(String serialNum)
    {
        this.serialNum = serialNum;
    }

    public void setStorage(int storage)
    {
        this.storage = storage;
    }

    // create a toString
    public String toString()
    {
        return "\nPhone Number: " + this.phoneNum + "\nBrand: " + this.brand + "\nSerial Number: " + 
                  this.serialNum + "\nStorage Capacity: " + this.storage;
    }
}