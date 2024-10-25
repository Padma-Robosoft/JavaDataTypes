package Task4.Question7;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine){
        this.model=model;
        this.engine=engine;
    }

    public void showCarInfo(){
        System.out.println("The model of the Car is: "+model);
        engine.showEngineType();
    }
}
