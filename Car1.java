public class Car1
{
    // attributes
    private int yearModel;
    private String make;
    private int speed;

    // constructor
    public Car1(int y, String m)
    {
        yearModel = y;
        make = m;
        speed = 0;
    }

    // setters
    public void setYearModel(int y)
    {
        yearModel = y;
    }

    // TODO: setMake method

    // TODO: setSpeed method

    // getters
    public int getYearModel()
    {
        return yearModel;
    }

    // TODO: getMake method

    // TODO: getSpeed method 

    // accelerate method
    public void accelerate()
    {
        setSpeed(getSpeed() + 5);
    }

    // TODO: brake() method
}