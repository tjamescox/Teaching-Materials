

public class PhoneDriver
{
    public static void main(String[] args)
    {
        // create phone objects
        Phone phone1 = new Phone("678-555-0987", "Apple", "SER345", 30);
        Phone phone2 = new Phone("678-555-7633", "Android", "IFJ928", 40);
        Phone phone3 = new Phone("678-555-5342", "Apple", "ISJ935", 60);
        Phone phone4 = new Phone("678-555-7362", "Samsung", "LSO938", 15);

        // create a 2d array
        Phone[][] array = new Phone[2][2];

        // put my objects in the array
        array[0][0] = phone1;
        array[0][1] = phone2;             //     Phone 1    |    Phone 2     
        array[1][0] = phone3;             // ---------------------------------
        array[1][1] = phone4;             //     Phone 3    |    Phone 4

        // nested for loop to find Apple phones
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j].getBrand().equals("Apple"))
                    System.out.print(array[i][j].toString());
            }
        }
    }
}


// first step: i = 0
// second step: j = 0  -----> phone1 is checked first @ array[0][0]
// third step: j = 1  -----> phone2 is checked second @ array[0][1]
// fourth step: i = 1
// fifth step: j = 0  -----> phone3 is checked third @ array[1][0]
// sixth step: j = 1  -----> phone4 is checked fourth @ array[1][1]