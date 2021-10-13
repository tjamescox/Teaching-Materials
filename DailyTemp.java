public class DailyTemp
{
    public static void main (String [] args)
    {
        double [] temp = {96, 75, 85, 66, 72, 76, 80};
       
        double sum = 0.0;
        double avg = 0.0;
       
        //this step is computing the total with a loop
        for (int i = 0; i < temp.length; i++)
        {
            sum += temp[i];
        }
       
        avg = sum/temp.length;
       
        //the "%" is used to set the decimal place, in this case it should show one decimal place
        System.out.printf("Average temperature for the week is %.1f",avg);
       
        //this section goes over the number of days above average
        int aboveavg = 0;
        for (int i = 0; i < temp.length; i++)
        {
            if (temp[i] > avg)
            aboveavg++;
        }
       
        System.out.println("");
        System.out.println("Number of days above average: " + aboveavg);
       
        //this section goes over the number of dayws below average
        int belowavg = 0;
        for (int i = 0; i < temp.length; i++)
        {
            if (temp[i] < avg)
            belowavg++;
        }
       
        System.out.println("");
        System.out.println("Number of days below average: " + belowavg);
    }
}  