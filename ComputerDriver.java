public class ComputerDriver
{
    public static void main(String[] args)
    {
        // Create some computer objects
        Computer c1 = new Computer("Dual Core", 32, "ALKSD23984");
        Windows w1 = new Windows("Windows", true, "Deca Core", 16, "EUSFN2384");
        Mac m1 = new Mac("MacBook Pro", true, "Hexa Core", 8, "EINVD29834");

        System.out.println(c1.toString());
        System.out.println(w1.toString());
        System.out.println(m1.toString());
    }
}