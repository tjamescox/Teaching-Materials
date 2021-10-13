// this program will use a 2d array and nested for loop to add values together

public class ForExample
{
    public static void main(String[] args)
    {
        int sum;

        int[][] array = { {2,6,4},
                          {7,4,9},
                          {3,1,9}};

        // nested for loop
        for(int row = 0; row < array.length; row++)
        {
            sum = 0;
            for(int col = 0; col < array.length; col++)
            {
                sum += array[row][col];
            }
            System.out.println("Sum of row " + row + " = " + sum);
        }
    }
}