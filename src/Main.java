public class Main {
    public static void main(String[] args) {

        Vehicle testVehicle = new Vehicle();
        Vehicle testVehicle2 = new Vehicle(3, "black", 2, "regular");

        Car testCar = new Car();
        Car testCar2 = new Car("Toyota");

        System.out.println(testVehicle.getWheels() + " " +testVehicle.getEngine() + " " + testVehicle.getColor()
         + " " + testVehicle.getFuel());

        testCar.honk();
        testCar2.displayInfo();
    }
}