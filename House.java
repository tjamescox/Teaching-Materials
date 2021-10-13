public class House
{
    // create our attribute
    private double rent;
    private int numBathrooms;
    private int numBedrooms;
    private int squareFootage;
    private String address;

    // Create our constructor
    public House(double rent, int numBathrooms, int numBedrooms, int squareFootage, String address)
    {
        this.rent = rent;
        this.numBathrooms = numBathrooms;
        this.numBedrooms = numBedrooms;
        this.squareFootage = squareFootage;
        this.address = address;
    }

    // create our getters (AKA Accessors)
    public double getRent()
    {
        return this.rent;
    }

    public int getBathrooms()
    {
        return this.numBathrooms;
    }

    public int getBedrooms()
    {
        return this.numBedrooms;
    }

    public int getFootage()
    {
        return this.squareFootage;
    }

    public String getAddress()
    {
        return this.address;
    }

    // create setters (AKA mutators)
    public void setRent(double rent)
    {
        this.rent = rent;
    }

    public void setBathrooms(int numBathrooms)
    {
        this.numBathrooms = numBathrooms;
    }

    public void setBedrooms(int numBedrooms)
    {
        this.numBedrooms = numBedrooms;
    }

    public void setFootage(int squareFootage)
    {
        this.squareFootage = squareFootage;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    // create a toString method
    public String toString()
    {
        return "\nRent: " + this.rent + "\nNumber of Bathrooms: " + this.numBathrooms + "\nNumber of Bedrooms:" +
               this.numBedrooms + "\nSquare Footage: " + this.squareFootage + "\nAddress: " + this.address;
    }
}