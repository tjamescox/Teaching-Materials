public class AreaCalc2
{
    // method that displays that this is a area calculator program
    public static void displayPro()
    {
        System.out.println("This program calculates the area of squares, triangles, and rectangles");
    }

    // method that calculates the area of a square
    public static int calcSquare(int side)
    {
        int area = side * side;
        return area;
    }

    // method that calculates the area of a rectangle
    public static double calcRec(double length, double width)
    {
        double area = length * width;
        return area;
    }

    // method that calculates the area of triangle (base*height/2)
    public static double calcTriangle(double height, double base)
    {
        double area = (height*base) / 2;
        return area;
    }

    // method that returns a String value that indicates the program is over
    public static String endMessage()
    {
        return "End of program";
    }

    public static void main(String[] args)
    {
        displayPro();
        int area = calcSquare(7);
        System.out.println("Value in area variable: " + area); // <-- variable area stores calcSquare(7) value on computer
        System.out.println("Area of square: " + calcSquare(5)); // <-- calcSquare(5) value is not stored on computer
        System.out.println("Area of rectangle: " + calcRec(6.5, 4.5));
        System.out.println("Area of rectangle: " + calcRec(10.5, 7.5));
        System.out.println("Area of triangle: " + calcTriangle(11.5, 6.5));
        System.out.println(endMessage());
    }
}