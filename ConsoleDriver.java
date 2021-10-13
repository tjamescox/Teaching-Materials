public class ConsoleDriver
{
    public static void main(String[] args)
    {
        Console c1 = new Console("Playstation 4");
        NintendoSwitch n1 = new NintendoSwitch("Nintendo Switch Lite", "Nintendo Switch");

        // another function of polymorphism
        Console c2 = new NintendoSwitch("Nintendo Switch Deluxe", "Nintendo Switch");
        
        // can store these values together through polymorphism
        Console[] array = new Console[3];
        array[0] = c1;
        array[1] = n1;
        array[2] = c2;

        for(int i = 0; i < array.length; i++)
           System.out.println(array[i].toString());
    }
}