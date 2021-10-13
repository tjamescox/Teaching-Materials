import java.io.IOException; 
import java.util.Random;
public class JumpTest {
   public static void cls() throws IOException, InterruptedException {
	if (System.getProperty("os.name").contains("Windows"))
	   new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
 	else
	   Runtime.getRuntime().exec("clear");
	}
  
public static void pause(int duration) throws InterruptedException{
Thread.sleep(duration);
	}

public static boolean isValidSpeed(double speed)  {
      boolean valid = false;
 //code to check if speed is withing the range of 0 - 5
 
 return valid;
   }
   
public static double getRandomSpeed() {
	int upper = 9;
	int lower = 1;
	Random rand = new Random();
	int r = 1 + rand.nextInt(upper - lower + 1);
	return (r/10.0);
}

   
public static void main(String[] args) throws IOException, InterruptedException {
	
	double speed = getRandomSpeed();  

System.out.println("speed = " + speed);
pause(2000);

if (args.length == 0)
   speed = speed * 1000;
else if (args.length == 1){
   speed = Double.parseDouble(args[0]);
   if (isValidSpeed(speed))
      speed = speed * 1000;
   else {
   System.out.println("Invalid speed, must be 0 - 5!");
   System.exit(0);
   }
}
else {
	  System.out.println("Invalid, at most one argument!");
	  System.exit(0);
  }
	


final int FIG_HEIGHT = 5;

String [] pos1 = new String[FIG_HEIGHT];
pos1[0] ="        ";
pos1[1] ="    O   ";
pos1[2] ="   /#\\ ";
pos1[3] ="   _|_  ";
pos1[4] ="        ";


String [] pos2 = new String[FIG_HEIGHT];
pos2[0] ="        ";
pos2[1] ="  __O__ ";
pos2[2] ="    #   ";
pos2[3] ="   _|_  ";
pos2[4] ="        ";


String [] pos3 = new String[FIG_HEIGHT];
pos3[0] ="        ";
pos3[1] ="   \\O/  ";
pos3[2] ="    #   ";
pos3[3] ="  _/ \\_ ";
pos3[4] ="        ";


    int i;
    
    while (true) {
        try {  
            for (i = 0; i < pos1.length; i++) {
				System.out.println(pos1[i]);
				pause(50);
				
			}
			cls();
            for (i = 0; i < pos2.length; i++) {
				System.out.println(pos2[i]);
				pause(50);
			}
			cls();
			for (i = 0; i < pos3.length; i++) {
				System.out.println(pos3[i]);
				pause(50);
			}
			cls();
			for (i = 0; i < pos2.length; i++) {
				System.out.println(pos2[i]);
				pause(50);
			}
			cls();
        
		} catch(InterruptedException e){ 
		} 
        } 
        
       
    }



}
