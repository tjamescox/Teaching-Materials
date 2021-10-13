public class VehicleDriver
{
    public static void main(String[] args)
    {
        // Vehicle object
        Vehicle truck = new Vehicle(true, 2, "Blue", 4);

        // Car object
        Car car1 = new Car("ALSD1234", true, 4, "Red", 4);

        // call toString for different objects
        System.out.println(truck.toString());
        System.out.println(car1.toString());
    }
}
