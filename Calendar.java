// different ways to store data: arrays and arraylists 

public class Calendar
{
    // Step one: define attributes of object
    // Use private data members, public methods to access these data members
    // define the attributes of a Calendar
    private String months;
    private int year;
    private String holiday;
    private boolean limitedEdition;

    // Step two:  create a constructor method (The method that "constructs" or creates the object)
    public Calendar(String months, int year, String holiday, boolean limitedEdition)
    {
        this.months = months;
        this.year = year;
        this.holiday = holiday;
        this.limitedEdition = limitedEdition;
    }

    // Step three:  create getters (AKA accessors)
    public String getMonths()
    {
        return this.months;
    }

    public int getYear()
    {
        return this.year;
    }

    public String getHoliday()
    {
        return this.holiday;
    }

    public boolean getEdition()
    {
        return this.limitedEdition;
    }

    // Step four:  create setters (AKA mutators)
    public void setMonth(String months)
    {
        this.months = months;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setHoliday(String holiday)
    {
        this.holiday = holiday;
    }

    public void setEdition(boolean limitedEdition)
    {
        this.limitedEdition = limitedEdition;
    }

    // Step five:  create toString method
    public String toString()
    {
        return "\nCalendar month: " + this.months + "\nCalendar year: " + this.year + 
                            "\nHoliday: " + this.holiday + "\nLimited Edition: " + this.limitedEdition;
    }

    public static void main(String[] args)
    {
        // create calendar object
        Calendar sportsCal = new Calendar("April", 2021, "April Fools", true);
        Calendar carCal = new Calendar("January", 1999, "MLK Day", false);
        Calendar tvCal = new Calendar("December", 2001, "Christmas", true);

        // test get methods
        System.out.println("Calendar month: " + sportsCal.getMonths());
        System.out.println("Calendar year: " + sportsCal.getYear());
        System.out.println("Holiday: " + sportsCal.getHoliday());
        System.out.println("Limited Edition?: " + sportsCal.getEdition());

        // test set methods
        sportsCal.setMonth("May");
        sportsCal.setHoliday("Cinco de Mayo");

        // test toString method
        System.out.println(sportsCal.toString());

        // Store our calendar objects in an array
        Calendar[] array = new Calendar[3];
        array[0] = sportsCal;
        array[1] = carCal;
        array[2] = tvCal;

        // create a for loop to print toString
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i].toString());
        }
    }// end of main method
}