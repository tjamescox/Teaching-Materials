import java.util.Scanner;

 

public class MilesAvg // class
 {

  public static void main(String[] args)
   {
    final int ROW = 5;
    final int COL = 7;
    double total = 0.0;
 int count = 0;
        
  // 1D array for the names of the runners
 String[] runner = new String[]{"Phillip", "Leela", "Amy", 
                                    "Hermes", "Hubert"};
         
  // 1D array for the days of the week 
 String[] day = new String[]{"Sunday","Monday", "Tuesday", "Wednesday",
                         "Thursday", "Friday", "Saturday"};
       
  // 2D array for miles ran by each runner
 double[][] num = new double[ROW][COL];
 
  // Scanner object
    Scanner ask = new Scanner(System.in); 
     
  
   // Loop to ask for miles    
  for(int row =0; row <num.length; row++) 
   { 
    for (int col=0; col < num[row].length; col++)
     { 
      System.out.println("Please enter " + day[col] + " miles for " + runner[row] + ".");
      num[row][col] = ask.nextDouble();
     }
    System.out.println();
   }
    
   // Loop to add up total(sum)
   double average;
  for (int col=0; col < num[0].length; col++)
   {
       total = 0.0; // <----- added this
    for (int row=0; row < num.length; row++)
    {
     total += num[row][col];
     ;
    }
    average = total/num.length; // <---- moved this here
    System.out.println("Average Miles Per Day /n =================/n" + day[col] + ": " + average); // <---- moved this here
   } 
   
    //double average = total / num.length;
     
  ;
  }
} // <---- added this so class has cloing bracket