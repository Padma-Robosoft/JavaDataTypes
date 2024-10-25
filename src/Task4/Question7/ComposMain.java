package Task4.Question7;

public class ComposMain {
    public static void main(String[] args) {
        Engine carEngine= new Engine("v8");
        Car myCar=new Car("lamborghini", carEngine);
        myCar.showCarInfo();
    }
}
