public class VideoGameDriver
{
    public static void main(String[] args)
    {
        // Create a video game object
        VideoGames v1 = new VideoGames("Jak and Daxter", "PS2");

        // Create a platformer object
        Platformer p1 = new Platformer(true, "Jak and Daxter III", "Jak and Daxter", "PS2");

        // Create a mario oddessy object
        MarioOddessy m1 = new MarioOddessy("3D platformer", 34, true, "Mario Oddessy", "Mario", "Nintendo Switch");

        // Use polymorphism to create objects
        // the variable type will be the main classes type, and the object type can be any of the classes
        // that inherit from it
        // this allows us to store different types of objects together
        VideoGames v2 = new VideoGames("Sekiro", "PS4");
        VideoGames p2 = new Platformer(true, "Ratchet and Clank", "Ratchet", "PS2");
        VideoGames m2 = new MarioOddessy("3D platformer", 34, true, "Mario Oddessy", "Mario", "Nintendo Switch");
        
        VideoGames[] array = {v2, p2, m2};

        for(int i = 0; i < array.length; i++)
           System.out.println(array[i].toString());
    }
}