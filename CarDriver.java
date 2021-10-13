public class CarDriver
{
    public static void main(String[] args)
    {
        // create objects
        Car c = new Car("Manuel", "IENSK238");
        Honda h = new Honda("Honda", "Automatic", "ASIEE9238");
        HondaCivic hc = new HondaCivic("2009 Civic", "Honda", "Automatic", "ASLDS9238");

        Car[] array = new Car[3];
        array[0] = c;
        array[1] = h;
        array[2] = hc;

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i] + "\n");
        }

        // polymorphism
        Car x = new Honda("Honda", "Automatic", "SLDJF92384");
        Car y = new HondaCivic("2013 Civic", "Honda", "Automatic", "IEAKD849");
        Car z = new Honda("Honda", "Manuel", "LSIEJLD948");

        Car[] array2 = new Car[3];
        array2[0] = x;
        array2[1] = y;
        array2[2] = z;

        // try to find cars with maunuel transmissions
        for(int j = 0; j < array2.length; j++)
        {
            if(array2[j].getTransmission().equals("Manuel"))
            {
                System.out.println(array2[j].toString());
            }
        }
    }
}