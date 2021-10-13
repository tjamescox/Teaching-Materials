public class Cars
{
    // attributes
    private String vinNum;
    private int mpg;

    // constructor method
    public Cars(String vinNum, int mpg)
    {
        this.vinNum = vinNum;
        this.mpg = mpg;
    }

    // getters (accessors)
    public String getVin()
    {
        return this.vinNum;
    }

    public int getMPG()
    {
        return this.mpg;
    }

    // setters (mutators)
    public void setVin(String vinNum)
    {
        this.vinNum = vinNum;
    }

    public void setMPG(int mpg)
    {
        this.mpg = mpg;
    }

    // toString method
    public String toString()
    {
        return "\nVin number: " + this.vinNum + "\nMPG: " + this.mpg;
    }
}

// =================================================================================
// =================================================================================

class Honda extends Cars
{
    // attributes
    private String maker;

    // constructor
    public Honda(String maker, String vinNum, int mpg)
    {
        super(vinNum, mpg);
        this.maker = maker;
    }

    // getters
    public String getMaker()
    {
        return this.maker;
    }

    // setters
    public void setMaker(String maker)
    {
        this.maker = maker;
    }

    // toString 
    public String toString()
    {
        return "\nVin number: " + getVin() + "\nMPG: " + getMPG() + "\nMaker: " + this.maker;
    }
}

// ==================================================================================================
// ==================================================================================================

class HondaAccord extends Honda
{
    // attributes 
    private int year;
    private String model;

    // constructor method
    public HondaAccord(int year, String model, String maker, String vinNum, int mpg)
    {
        super(maker, vinNum, mpg);
        this.year = year;
        this.model = model;
    }

    // getters
    public int getYear()
    {
        return this.year;
    }

    public String getModel()
    {
        return this.model;
    }

    // setters
    public void setYear(int year)
    {
        this.year = year;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    // toString
    public String toString()
    {
        return "\nVin number: " + getVin() + "\nMPG: " + getMPG() + "\nMaker: " + getMaker() + 
                "\nYear: " + this.year + "\nModel: " + this.model;
    }
}