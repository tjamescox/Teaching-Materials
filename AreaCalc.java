public class AreaCalc
{
    // overloaded methods: have same method name, different list of parameters

    // calculate area of a square: int side
    public static int getArea(int side)
    {
        int area = side * side;
        return area;
    }

    // calculate area of a rectangle: int width, int length
    public static int getArea(int width, int length)
    {
        int answer = width * length;
        return answer;
    }

    // calculate area of a triangle: double base, double height
    public static double getArea(double base, double height)
    {
        double area2 = (base * height) / 2;
        return area2;
    }

    // main method
    public static void main(String[] args)
    {
        System.out.println("Area of square: " + getArea(5));
        System.out.println("Area of rectangle: " + getArea(5, 7));
        System.out.println("Area of triangle: " + getArea(5.5, 6.5));
    }
}