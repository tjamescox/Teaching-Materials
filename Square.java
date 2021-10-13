interface SquareInt
{
    int perimeter(int side);
    int area(int width, int length);
}

public class Square implements SquareInt
{
    public int perimeter(int side)
    {
        return 4*side;
    }

    public int area(int width, int length)
    {
        return width*length;
    }

    public static void main(String[] args)
    {
        Square obj = new Square();

        int x = 5;
        int y = 6;

        System.out.println("Area: " + obj.area(x, y));
        System.out.println("Perimeter: " + obj.perimeter(x));
    }
}