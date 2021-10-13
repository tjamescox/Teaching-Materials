// Hierarchy: 1: MusicAssemble ---> 2: Rhythm Section ----> 3:Drummer/Keyboards 

public class MusicAssemble
{
    // Attributes
    private String assembleName;
    private String genre;

    // Constructor method
    public MusicAssemble(String assembleName, String genre)
    {
        this.assembleName = assembleName;
        this.genre = genre;
    }

    // getters 
    public String getAssemble()
    {
        return this.assembleName;
    }

    public String getGenre()
    {
        return this.genre;
    }

    // setters
    public void setAssemble(String assembleName)
    {
        this.assembleName = assembleName;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    // toString method
    public String toString()
    {
        return "\nAssemble name: " + this.assembleName + "\nGenre: " + this.genre;
    }
} // end of MusicAssemble class

// ===================================================================================================
// ===================================================================================================

class RhythmSection extends MusicAssemble
{
    // Attributes
    private int numPlayers;

    // Constructor
    public RhythmSection(int numPlayers, String assembleName, String genre)
    {
        super(assembleName, genre);
        this.numPlayers = numPlayers;
    }

    // getters
    public int getPlayers()
    {
        return this.numPlayers;
    }

    // setters
    public void setPlayers(int numPlayers)
    {
        this.numPlayers = numPlayers;
    }

    // toString
    public String toString()
    {
        return "\nAssemble name: " + getAssemble() + "\nGenre: " + getGenre() + "\nNumber of players in rhythm section: " + this.numPlayers;
    }
}

// =====================================================================================================
// =====================================================================================================

class Drummer extends RhythmSection
{
    // Attributes
    String name;
    int pieceKit;

    // Constructor method
    public Drummer(String name, int pieceKit, int numPlayers, String assembleName, String genre)
    {
        super(numPlayers, assembleName, genre);
        this.name = name;
        this.pieceKit = pieceKit;
    }

    // getters
    public String getName()
    {
        return this.name;
    }

    public int getKit()
    {
        return this.pieceKit;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setKit(int pieceKit)
    {
        this.pieceKit = pieceKit;
    }

    // toString
    public String toString()
    {
        return "\nAssemble name: " + getAssemble() + "\nGenre: " + getGenre() + "\nNumber of players in rhythm section: " + 
        getPlayers() + "\nDrummer's name: " + this.name + "\nNumber of pieces on drum kit: " + this.pieceKit;
    }
}