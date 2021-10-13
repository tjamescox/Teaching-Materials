// working with 2D arrays

public class TwoD
{
    public static void main(String[] args)
    {
        // initialize 2D array
        int[][] array = {{3, 5, 6, 7, 8},   // int[][] array = new int[row][col];
                         {4, 2, 6, 7, 8},
                         {4, 2, 8, 9, 1},
                         {5, 3, 7, 6, 2}};

        // nested for loop: its a for loop within a for loop
        for(int i = 0; i < array.length; i++)
        {
            for(int k = 0; k < 5; k++)
            {
                System.out.print(array[i][k] + ", ");
            }
            System.out.print("\n");
        }
    }
}