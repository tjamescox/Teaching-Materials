public class Phone2
{
    // intitialize our variables (memory locations) to hold our attributes
    String color;
    String type;
    int numApps;
    String serialNum;

    // Constructor method: creates a data type/object
    public Phone2(String color, String type, int numApps, String serialNum)
    {
        this.color = color;
        this.type = type;
        this.numApps = numApps;
        this.serialNum = serialNum;
    }

    // toString method: displays all the values stored in an object
    // Method header set up: publicIdentifier (public/private), returningDataType, nameTheMethod, parameters ()
    public String toString()
    {
        return "Color: " + this.color + "\nType: " + this.type + "\nSerial Number: " + this.serialNum + "\nNumber of apps: " + this.numApps;
    }

    // Main method
    public static void main(String[] args)
    {
        Phone2 tanPhone = new Phone2("Black", "IPhone 6s", 20, "ALKDS2343");
        // Phone2 ranPhone = new Phone2("Red", 45, "Samsung Galaxy", "ALDK0933"); <-- This causes errors

        System.out.print(tanPhone.toString());
    }
}