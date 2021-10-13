// look through an array and spit out the highest and lowest values of the array
// Author: Tanner Cox

public class HighLow
{
    public static void main(String[] args)
    {
        // initialize our variables 
        int highest;
        int lowest;
        int[] array = {43, 54, 85, 12, 75, 97, 56, 34, 56, 97, 45, 76, 43, 87, 45}; // <-- dont need to know length of array
        // int[] array = new int[6]  <--- have to know length = highestIndex + 1

        // length method: tells you how many entries are in array
        System.out.println("Length of array: " + array.length);

        highest = array[0];
        lowest = array[0];

        // for loop and start testing to see what are the highest/lowest values
        for(int i = 0; i < array.length; i++)
        {
            // if value in highest variable is less than array[i] update highest
            if(highest < array[i])
                highest = array[i];

            if(lowest > array[i])
                lowest = array[i];
        }

        // display highest lowest value
        System.out.println("Highest value of array: " + highest);
        System.out.println("Lowest value of array: " + lowest);
    }
}