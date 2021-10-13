// Program that gets user input to calculate the area/perimeter of a square
// Author: Tanner Cox

import java.util.Scanner;

public class SquareArea
{
    public static int getArea(int length, int width)
    {
        int area2;
        area2 = length*width;
        return area2;
    }

    public static int getPerimeter(int length, int width)
    {
        int perimeter2;
        perimeter2 = 2*length + 2*width;
        return perimeter2;
    }

    public static void main(String[] args)
    {
        // create our keyboard object
        Scanner keyboard = new Scanner(System.in);

        // Allocate memory 
        int length;
        int width;
        int area;
        int perimeter;

        // Prompt the user to input length/width
        System.out.print("ENTER length: ");
        length = keyboard.nextInt();
        System.out.print("ENTER width: ");
        width = keyboard.nextInt();

        // Calculate perimeter/area
        perimeter = 2*length + 2*width;
        area = length*width;

        // Display to the user the perimeter and area of square
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        // Display to user the area/perimeter using area/perimeter method
        System.out.println("Area: " + getArea(length, width));
        System.out.println("Perimeter: " + getPerimeter(length, width));
    }
}