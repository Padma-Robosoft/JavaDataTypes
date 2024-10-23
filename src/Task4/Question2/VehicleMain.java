package Task4.Question2;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.info();
        vehicle.info("car");

        Car mycar=new Car();
        mycar.fuelType();

        Bike mybike=new Bike();
        mybike.fuelType();
    }
}
