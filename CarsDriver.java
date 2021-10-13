public class CarsDriver
{
    public static void main(String[] args)
    {
        // create some objects
        Cars c1 = new Cars("LSDIHE234", 25);
        Honda h1 = new Honda("Honda", "OSUEN928", 28);
        HondaAccord ha1 = new HondaAccord(2003, "Accord SE", "Honda", "DIENB243", 22);

        Cars[] array = {c1, h1, ha1};

        for(int i = 0; i < array.length; i++)
            System.out.println(array[i].toString());

        // polymorphism
        Cars c2 = new Honda("Honda", "ISNEK123", 23);
        Cars c3 = new HondaAccord("2012", "Accord", "Honda", "JDHIE124", 30);
    }
}