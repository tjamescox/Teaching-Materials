import java.util.Scanner;
public class Arraysszzz
{
	public static void main(String[] args)
	{
	
   //create scanner object
   Scanner el = new Scanner(System.in);


double [][] miles = {{12.2, 8.6, 0, 4.1, 5.2, 6.7, 0},
                     {16.2, 36.2, 36.6, 12.1, 0,6.6, 7.9},
                     {1.1, 0.3, 3.4, 4.6, 2.1, 0, 0},
                     {1.2, 1.4, 1.6, 1.7, 1.8, 1.9, 1.4},
                     {0, 0, 0, 0, 0, 0, 0}};

String[] days =  {"monday", "tuesday","wednessday", "thursday", "friday", "saturday", "sunday"};
String[] names = {"philip", "leela", "amy", "hermes", "hubert"};




for(int e = 0; e < miles.length; e++){

   for(int h = 0; h < miles[e].length; h++){
   
   System.out.println(miles[e][h]);
   
   
   System.out.println("rows:" + e + " " + " col"+ h);

   
   }//




}//





 for(int i = 0; i < days.length; i++){     
                     System.out.println( "How many miles did"  + names[0] + " run on " + days[i] + "?");
                        days[i] = el.nextLine();
                         System.out.println("You ran  = " + days[i]);                    
                       
                        
}


    for(int a = 0; a < days.length; a++){     
                     System.out.println( "How many miles did "  + names[1] + "run on " + days[a] + "?");
                        days[a] = el.nextLine();
                         System.out.println("You ran  = " + days[a]);

  }


  for(int b = 0; b < days.length; b++){     
                     System.out.println( "How many miles did"  + names[2] + "run on " + days[b] + "?");
                        days[b] = el.nextLine();
                         System.out.println("You ran  = " + days[b]);

  }


  for(int c = 0; c < days.length; c++){     
                     System.out.println( "How many miles did"  + names[3] + "run on " + days[c] + "?");
                        days[c] = el.nextLine();
                         System.out.println("You ran  = " + days[c]);

  }
  
  
    for(int d = 0; d < days.length; d++){     
                     System.out.println( "How many miles did"  + names[4] + "run on " + days[d] + "?");
                        days[d] = el.nextLine();
                         System.out.println("You ran  = " + days[d]);

  }

  
  
  
  
  
  
  
  
  

}//end main
}//end class