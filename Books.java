// family portrait, heat press, fantasy books

public class Books
{
    // Attributes (initializing our variables)
    private String title;
    private String author;
    private int bookID;

    // Constructor method
    public Books(String title, String author, int bookID)
    {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    // Copy constructor: copies existing object and duplicates it
    public Books(Books b)
    {
        b.title = title;
        b.author = author;
        b.bookID = bookID;
    }

    // getters (accessors)
    public String getTitle()
    {
        return this.title;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public int getID()
    {
        return this.bookID;
    }

    // setters (mutators)
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setID(int bookID)
    {
        this.bookID = bookID;
    }

    // toString method
    public String toString()
    {
        return "\nBook title: " + this.title + "\nAuthor: " + this.author + "\nBook ID: " + this.bookID;
    }
} // end class Books

// =============================================================================================================
// =============================================================================================================

class Fantasy extends Books
{
    // attributes
    private String genre;

    // constructor method
    public Fantasy(String genre, String title, String author, int bookID)
    {
        super(title, author, bookID);
        this.genre = genre;
    }

    // getter
    public String getGenre()
    {
        return this.genre;
    }

    // setter
    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    // toString method
    public String toString()
    {
        return "\nBook title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nBook ID: " + getID() + 
                      "\nGenre: " + this.genre;
    }
}

