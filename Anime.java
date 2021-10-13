interface AnimeInterface
{
    public void method1();
    public void method2();
    public void method3();
}

public class Anime implements AnimeInterface
{
    // overridden method for method1()
    public void method1()
    {
        System.out.println("     ( )    ");
        System.out.println("     / /    ");
        System.out.println("      |     ");
        System.out.println("     / /    ");
    }

    // overridden method for method2()
    public void method2()
    {
        System.out.println("  ,=,e  ");
        System.out.println(",=,e     ,=,e");
        System.out.println("       ,=,e");
        System.out.println("  ,=,e         ,=,e");
    }

    // overriden method for method3()
    public void method3()
    {
        System.out.println("     **      ");
        System.out.println("    ****     ");
        System.out.println("  ********   ");
        System.out.println("    ****     ");
        System.out.println("   **  **    ");
        System.out.println("  *      *");
    }

    // main method
    public static void main(String[] args)
    {
        // create Anime object using a default constructor
        Anime obj = new Anime();

        obj.method1();
        obj.method2();
        obj.method3();
    }
}