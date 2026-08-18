package OOPS.D03inheritance;

public class main {
    public static void main(String[] args) {

        Car car = new Car("Ferrari", "LaFerrari", 4, 2, "dual-clutch transmission");
        System.out.println("Car's name is " + car.name);
        car.StartEngine();
        car.startAC();
        car.StopEngine();

        MotorCycle motorCycle = new MotorCycle("Harley Davidson", "Sportster s", 2 , "flat-track", "Showa");
        System.out.println("Motorcycle's name is " + motorCycle.name);
        motorCycle.StartEngine();
        motorCycle.Wheelei();
        motorCycle.StopEngine();

    }
}
