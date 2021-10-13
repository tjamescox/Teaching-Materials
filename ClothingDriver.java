import java.util.ArrayList;

public class ClothingDriver
{
    public static void main(String[] args)
    {
       Clothing c1 = new Clothing("Blue", "Men's Shirt", 19.97);
       Clothing c2 = new Clothing("White", "Women's Shirt", 24.97);
       Clothing c3 = new Sweatshirt("Medium", "RICH B.U.M.", "Red", "Men's Sweatshirt", 39.97);
       Clothing c4 = new Sweatshirt( "Large", "RICH B.U.M.", "Orange", "Women's Sweatshirt", 39.97);

      ArrayList<Clothing> arrayL = new ArrayList<Clothing>();
      
      arrayL.add(c1);
      arrayL.add(c2);
      arrayL.add(c3);
      arrayL.add(c4);
      
      for(int i = 0; i < arrayL.size(); i++)
         System.out.println(arrayL.get(i).toString());
    }
}