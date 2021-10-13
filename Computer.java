// Computer heirarchy, Computer (main class), Mac (second tier), Windows (second tier)
// 1. Computer
// 2. Mac and Windows (extends or inherits from Computer class)
// 3. MacBook Pro (extends or inherit from Mac) or HP Pavillion (extend or inherit from Windows)

public class Computer
{
    // Attributes
    private String cpuType;
    private int memory;
    private String serialNum;

    // Constructor
    public Computer(String cpuType, int memory, String serialNum)
    {
        this.cpuType = cpuType;
        this.memory = memory;
        this.serialNum = serialNum;
    }

    // Copy Constructor: duplicate objects
    public Computer(Computer c)
    {
        cpuType = c.cpuType;
        memory = c.memory;
        serialNum = c.serialNum;
    }

    // getters (accessors)
    public String getCPU()
    {
        return this.cpuType;
    }

    public int getMemory()
    {
        return this.memory;
    }

    public String getSerial()
    {
        return this.serialNum;
    }

    // setters (mutators)
    public void setCPU(String cpuType)
    {
        this.cpuType = cpuType;
    }

    public void setMemory(int memory)
    {
        this.memory = memory;
    }

    public void setSerial(String serialNum)
    {
        this.serialNum = serialNum;
    }

    // create toString method
    public String toString()
    {
        return "\nCPU: " + this.cpuType + "\nMemory: " + this.memory + " GB" + "\nSerial Number: " + this.serialNum;
    }
}

// =================================================================================================================
// =================================================================================================================

class Windows extends Computer // <--- extends keyword (REMEMBER)
{
    private String OS;
    private boolean isLaptop;

    // constructor 
    public Windows(String OS, boolean isLaptop, String cpuType, int memory, String serialNum)
    {
        super(cpuType, memory, serialNum); // <----- super keyword (REMEBER)
        this.OS = OS;
        this.isLaptop = isLaptop;
    }

    // getters (accessors)
    public String getOS()
    {
        return this.OS;
    }

    public boolean getLaptop()
    {
        return this.isLaptop;
    }

    // setters (mutators)
    public void setOS(String OS)
    {
        this.OS = OS;
    }

    public void setLaptop(boolean isLaptop)
    {
        this.isLaptop = isLaptop;
    }

    // create toString method
    public String toString()
    {
        return "\nCPU: " + getCPU() + "\nMemory: " + getMemory() + " GB" + "\nSerial Number: " + getSerial() + 
                   "\nOperating System: " + this.OS + "\nIs this a laptop?: " + this.isLaptop;
    }
}

// ================================================================================================================
// ================================================================================================================

class Mac extends Computer
{
    // attributes
    private String computerName;
    private boolean softwareDownload;

    // constructor
    public Mac(String computerName, boolean softwareDownload, String cpuType, int memory, String serialNum)
    {
        super(cpuType, memory, serialNum);
        this.computerName = computerName;
        this.softwareDownload = softwareDownload;
    }

    // getters (accessors)
    public String getName()
    {
        return this.computerName;
    }

    public boolean getSoftware()
    {
        return this.softwareDownload;
    }

    // setters (mutators)
    public void setName(String computerName)
    {
        this.computerName = computerName;
    }

    public void setSoftware(boolean softwareDownload)
    {
        this.softwareDownload = softwareDownload;
    }

    // create toString method
    public String toString()
    {
        return "\nCPU: " + getCPU() + "\nMemory: " + getMemory() + " GB" + "\nSerial Number: " + getSerial() + 
                   "\nName: " + this.computerName + "\nIs the software downloaded?: " + this.softwareDownload;
    }
}