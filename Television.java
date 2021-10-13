import java.util.Scanner;

public class Television
{
    // create our attributes
    private String brand;
    private int size;
    private String serialNum;
    private double price;

    // create our constructor method
    public Television(String brand, int size, String serialNum, double price)
    {
        this.brand = brand;
        this.size = size;
        this.serialNum = serialNum;
        this.price = price;
    }

    // create our getters (AKA accessors)
    public String getBrand()
    {
        return this.brand;
    }

    public int getSize()
    {
        return this.size;
    }

    public String getSerial()
    {
        return this.serialNum;
    }

    public double getPrice()
    {
        return this.price;
    }

    // create our setters (AKA mutators)
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public void setSerial(String serialNum)
    {
        this.serialNum = serialNum;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    // toString method
    public String toString()
    {
        return "\nTV Brand: " + this.brand + "\nSize: " + this.size + " inches" + 
                 "\nSerial Number: " + this.serialNum + "\nPrice: $" + this.price;
    }

    // create our main method
    public static void main(String[] args)
    {
        // initialize keyboard
        Scanner keyboard = new Scanner(System.in);

        // initialize variable to store max price for tv
        double maxPrice;

        // Create our Television objects
        Television tv1 = new Television("Samsung", 60, "IAKD9870", 1500.00);
        Television tv2 = new Television("Haier", 50, "EDGH09732", 999.99);
        Television tv3 = new Television("LG", 80, "OWIND9873", 1200.00);
        Television tv4 = new Television("Cosco", 40, "ODJHE1928", 350.00);
        Television tv5 = new Television("Apple", 65, "ALKSD1983", 2000.00);

        // Create our Television array to store our objects
        Television[] tvArray = new Television[5];
        // fill the array
        tvArray[0] = tv1;
        tvArray[1] = tv2;
        tvArray[2] = tv3;
        tvArray[3] = tv4;
        tvArray[4] = tv5;

        // Prompt the user to input max price they'll pay for a tv
        System.out.print("ENTER max price you'll pay for TV: $");
        maxPrice = keyboard.nextDouble();

        // create a for loop to search for televisions user can afford
        for(int i = 0; i < tvArray.length; i++)
        {
            if(maxPrice >= tvArray[i].getPrice())
            {
                System.out.println(tvArray[i].toString());
            }
        }
    }// end of main method
}// end of Television class