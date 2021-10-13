public class Variables
{
    public static void main(String[] args)
    {
        String name = "Tanner Cox";  // String variable, represents text 
        String num = "14253";  // String but is represented as text, cannot be used for calculations

        int num2 = 86349; // int variable that can be used for calculation; int can only be whole number
        int num3 = num2*2;

        System.out.println(num3); // display num3 value
        System.out.println(name); // display String value for name

        double dub1 = 5.5; // double variable, is a number with decimal places

        System.out.println(dub1/2); 
       // System.out.println(num/2); <--- cannot do calculations with String numbers

        float float1 = 1.7578;  // float is also for decimals, less accurate than double
        
        boolean boo = true; // boolean variable represents true or false
    }
}