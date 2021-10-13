// this program will allow us to create a Person object (our own data type)

public class Person1
{
    // Attributes: these are the actual memory locations (variables)
    String name;
    int age;
    String hobby;
    String favArtist;
    boolean isFemale;

    // Constructor method: creates your object (data type) Person
    public Person1(String name, int age, String hobby, String favArtist, boolean isFemale) // (instace variable)
    {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.favArtist = favArtist;
        this.isFemale = isFemale;
    } 

    // toString method
    public String toString()
    {
        return "Name: " + this.name + "\nAge: " + this.age + "\nHobby: " + this.hobby + "\nFavorite artist: " + 
                                                 this.favArtist + "\nIs this person female? : " + this.isFemale + "\n\n";
    }

    // create Person1 objects
    public static void main(String[] args)
    {
        Person1 tan = new Person1("Tanner Cox", 25, "Drums", "Anderson .Paak", false);
        Person1 alexis = new Person1("Alexis Bennett", 27, "Reading", "Kane Brown", true);
        Person1 jam = new Person1("Jamar Sheffield", 19, "Piano", "Giveon", false);
        Person1 ket = new Person1("Ketler RENE", 19, "Soccer", "Wendy", false);
        Person1 jav = new Person1("Javonte Carr", 18, "Video Games", "Kodak Black", false);
        // Person1 eug = new Person1("Eugenia Korankye", )

        // store values in array
        Person1[] array = {tan, alexis, jam, ket, jav};

        // display object values
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i].toString()); // toString method is not Static!!!!
        }
    }
}