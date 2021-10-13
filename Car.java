// Author: Tanner Cox

public class Car // parent class
{
    // attributes
    private String transmission;
    private String vinNum;
    private int numSeats;

    // constructor
    public Car(String transmission, String vinNum, int numSeats)
    {
        this.transmission = transmission;
        this.vinNum = vinNum;
        this.numSeats = numSeats;
    }

    // copy constructor
    public Car(Car c)
    {
        c.transmission = transmission;
        c.vinNum = vinNum;
    }

    // getters
    public String getTransmission()
    {
        return this.transmission;
    }

    public String getVin()
    {
        return this.vinNum;
    }

    // setters
    public void setTransmission(String transmission)
    {
        this.transmission = transmission;
    }

    public void setVin(String vinNum)
    {
        this.vinNum = vinNum;
    }

    // toString method
    public String toString()
    {
        return "Transmission: " + this.transmission + "\nVin Number: " + this.vinNum;
    }
}

class Honda extends Car
{
    // attributes
    private String company;

    // constructor
    public Honda(String company, String transmission, String vinNum)
    {
        super(transmission, vinNum);
        this.company = company;
    }

    // getter
    public String getCompany()
    {
        return this.company;
    }

    // setter
    public void setCompany(String company)
    {
        this.company = company;
    }

    // toString method
    public String toString()
    {
        return super.toString() + "\nCompany: " + this.company;
        // return "Transmission: " + getTransmission() + "\nVin Number: " + getVin() + "\nCompany: " + this.company;
    }
}

class HondaCivic extends Honda
{
    // attributes
    private String type;

    // constructor
    public HondaCivic(String type, String company, String transmission, String vinNum)
    {
        super(company, transmission, vinNum);
        this.type = type;
    }

    // getter
    public String getType()
    {
        return this.type;
    }

    // setter
    public void setType(String type)
    {
        this.type = type;
    }

    // toString method
    public String toString()
    {
        return super.toString() + "\nType: " + this.type;
    }
}