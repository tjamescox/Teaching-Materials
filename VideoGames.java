// public class VideoGames ---> class Platformer ----> MarioOddessy

public class VideoGames
{
    // attributes 
    private String mainCharacter;
    private String console;

    // constructor
    public VideoGames(String mainCharacter, String console)
    {
        this.mainCharacter = mainCharacter;
        this.console = console;
    }

    // copy constructor
    public VideoGames(VideoGames v)
    {
        mainCharacter = v.mainCharacter;
        console = v.console;
    }

    // getters (accessors)
    public String getMain()
    {
        return this.mainCharacter;
    }

    public String getConsole()
    {
        return this.console;
    }

    // setters (mutators)
    public void setMain(String mainCharacter)
    {
        this.mainCharacter = mainCharacter;
    }

    public void setConsole(String console)
    {
        this.console = console;
    }

    // create our toString method
    public String toString()
    {
        return "\nMain Character: " + this.mainCharacter + "\nConsole: " + this.console;
    }
}

class Platformer extends VideoGames // <--- extends is a new keyword
{
    // attributes 
    private boolean canJump;
    private String name;

    // constructor: creates an object (AKA data type)
    public Platformer(boolean canJump, String name, String mainCharacter, String console)
    {
        super(mainCharacter, console); // <--- super keyword
        this.canJump = canJump;
        this.name = name;
    }

    // getters
    public boolean getJump()
    {
        return this.canJump;
    }

    public String getName()
    {
        return this.name;
    }

    // setters
    public void setJump(boolean canJump)
    {
        this.canJump = canJump;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // toString method
    public String toString()
    {
        return "\nMain Character: " + getMain() + "\nConsole: " + getConsole() + "\nCan the player jump?: " +
                     this.canJump + "\nName of game: " + this.name;
    }
}

class MarioOddessy extends Platformer
{
    // attributes 
    private String type;
    private int numCoins;

    // constructor
    public MarioOddessy(String type, int numCoins, boolean canJump, String name, String mainCharacter, String console)
    {
        super(canJump, name, mainCharacter, console);
        this.type = type;
        this.numCoins = numCoins;
    }

    // getters
    public String getType()
    {
        return this.type;
    }

    public int getCoins()
    {
        return this.numCoins;
    }

    // setters
    public void setType(String type)
    {
        this.type = type;
    }

    public void setCoins(int numCoins)
    {
        this.numCoins = numCoins;
    }

    // toString method
    public String toString()
    {
        return "\nMain Character: " + getMain() + "\nConsole: " + getConsole() + "\nCan the player jump?: " +
                     getJump() + "\nName of game: " + getName() + "\nType of game: " + this.type + "Number of coins: " + this.numCoins;
    }
}