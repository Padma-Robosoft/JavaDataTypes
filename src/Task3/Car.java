package Task3;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String make, String model, int year){
        this.brand=make;
        this.model=model;
        this.year=year;
    }

    public void displayDetails(){
        System.out.println("Car Details are: ");
        System.out.println("The Brand of the Car is: "+brand);
        System.out.println("The Model of the car is: "+model);
        System.out.println("The Year of Manufacture is : "+year);
    }

}
