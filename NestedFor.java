// program that finds the smallest value in 2d array

public class NestedFor
{
    public static void main(String[] args)
    {
        int smallest;
        int largest;

        // create 2d array
        int[][] array = { {56, 78, 89},
                          {12, 99, 45},
                          {88, 43, 27},
                        };

        smallest = array[0][0];
        largest = array[0][0];


        // nested for loop 
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                // look through 2D array by rows
                if(smallest > array[i][j])
                    smallest = array[i][j];

                // look through 2D array by cols
                if(largest < array[j][i])
                    largest = array[j][i];
            }
        }

        // see the smallest/largest values
        System.out.println("Smallest value in 2D array: " + smallest);
        System.out.println("Largest value in 2D array: " + largest);
    }
}