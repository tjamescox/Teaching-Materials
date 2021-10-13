public class Console
{
    // attributes
    private String name;

    // constructor
    public Console(String name)
    {
        this.name = name;
    }

    // getters
    public String getName()
    {
        return this.name;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    // toString
    public String toString()
    {
        return "Console: " + this.name;
    }
}

class NintendoSwitch extends Console
{
    // attributes
    private String type;

    // constructor
    public NintendoSwitch(String type, String name)
    {
        super(name);
        this.type = type;
    }

    // getters
    public String getType()
    {
        return this.type;
    }

    // setters
    public void setType(String type)
    {
        this.type = type;
    }

    // toString method
    public String toString()
    {
        return "\nConsole: " + getName() + "\nType: " + this.type;
    }
}