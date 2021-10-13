public class BookDriver
{
    public static void main(String[] args)
    {
        Books b1 = new Books("Singer of all songs", "Kate Constable", 847363);
        Fantasy f1 = new Fantasy("Fantasy", "Lord of the Rings", "JR Tolkien", 948398);

        System.out.println(b1.toString());
        System.out.println(f1.toString());

        // use set methods
        b1.setID(111111);

        System.out.println(b1.toString());

        // use get method
        System.out.println("\n" + b1.getTitle());
    }
}