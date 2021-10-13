public class Shapes1Driver
{
    public static void main(String[] args)
    {
        Shapes1 square = new Shapes1(4, "Square");

        // getters
        System.out.println(square.getSides());
        System.out.println(square.getName());

        // setters
        square.setSides(3);
        square.setName("Triangle");
        System.out.println(square.getSides());
        System.out.println(square.getName());
    }
}