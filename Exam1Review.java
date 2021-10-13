// nested for loops: used for 2d arrays (search through rows and columns), getting multiple user inputs for certian things (Student
// and you need know his name and 5 different test grades)
int[][] array = new int[5][5]; // <--- int[row][col]

for(int i = 0; i < array.length; i++) // outer for loop: iterate 5 times
{
    for(int j = 0; j < array.length; j++) // inner for loop: iterate 25 times
    {
        System.out.print(array[i][j]); // display from left to right
        System.out.print(array[j][i]); // display from top to bottom
    }
}


// Classes: getters/setters, toString, attributes, constructor method 
// We will use class Laptop to create laptop objects

// Attributes: later these will all be stored together as an object
private String serialNumber; // <--- unique value to differentiate the different objects
private double screenSize;
private boolean touchScreen;
private int memorySize;

// Constructor method: creates the object (creates a new data type)
public Laptop(String serialNumber, double screenSize, boolean touchScreen, int memorySize)
{
    this.serialNumber = serialNumber;
    this.screenSize = screenSize;
    this.touchScreen = touchScreen;
    this.memorySize = memorySize;
}

Scanner keyboard = new Scanner(System.in);

// get methods (accessors): to access private data members (data hiding)
public String getSerial()
{
    return this.serialNumber;
}

public double getScreen()
{
    return this.screenSize;
}

public boolean getTouch()
{
    return this.touchScreen;
}

public int getMemory()
{
    return this.memorySize;
}

// set methods (mutators): change private data members
public void setSerial(String serialNumber)
{
    this.serialNumber = serialNumber;
}

public void setScreen(double screenSize)
{
    this.screenSize = screenSize;
}

public void setTouch(boolean touchScreen)
{
    this.touchScreen = touchScreen;
}

public void setMemory(int memorySize)
{
    this.memorySize = memorySize;
}

// toString method: print out ALL of the details of the Laptop object
public String toString()
{
    return "Serial Number: " + this.serialNumber + "\nScreen size: " + this.screenSize + "\nIs it touch screen?: " +
             this. touchScreen + "\nMemory size: " + this.memorySize;
}  


// .equals method (in this example lets talk about String values)
String name = "Tanner";
name = "Kevin";
(name == "Tanner"); // compares memory locations
      vs.
name.equals("Tanner"); // compares the actual data values


// inheritence: it creates a class heirarchy where subclasses inherit all the attributes and methods of a parent class (laptop class)
// child class (HPpavilion)
class HPpavilion extends Laptop // <--- remember extends keyword
{
    // attribute
    String company;

    // constructor
    public HPpavilion(String company, String serialNumber, double screenSize, boolean touchScreen, int memorySize)
    {
        super(serialNumber, screenSize, touchScreen, memorySize); // <--- another keyword
        this.company = company;
    }

    // getters (just for String company)
    // .................

    // getters/setters for laptop attributes have already been defined in Laptop class (dont need to do it again)

    // setters (just for String company)
    // .................

    // toString method: print out ALL of the details of the Laptop object
    public String toString()
    {
        return "Serial Number: " + getSerial() + "\nScreen size: " + getScreen() + "\nIs it touch screen?: " +
            getScreen() + "\nMemory size: " + getMemory() + "\nCompany: " + this.company;
    }  
}