package Task4.Question5;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle mycar=new CarV();
        Vehicle myBike=new BikeV();
        myBike.start();
        myBike.stop();
        mycar.start();
        mycar.stop();
    }
}
