public class MusicDriver
{
    public static void main(String[] args)
    {
        // create music objects
        MusicAssemble m1 = new MusicAssemble("Snarky Puppy", "Jazz");
        RhythmSection r1 = new RhythmSection(3, "Snarky Puppy", "Jazz");
        Drummer d1 = new Drummer("Larnell Lewis", 7, 3, "Snarky Puppy", "Jazz");

        System.out.println(m1.toString());
        System.out.println(r1.toString());
        System.out.println(d1.toString());

        // create an array
        MusicAssemble[] array = {m1, r1, d1};

        // Example of polymorphism
        MusicAssemble m2 = new RhythmSection(3, "Ghost-Note", "Jazz");
        MusicAssemble m3 = new Drummer("Robert Sput", 6, 3, "Ghost-Note", "Jazz");
    }
}