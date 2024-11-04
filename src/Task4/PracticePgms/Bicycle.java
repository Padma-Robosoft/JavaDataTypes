package Task4.PracticePgms;

public interface Bicycle {
    void applyBrakes(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    public void applyBrakes(int decrement){
        System.out.println("Applying Brake...");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up...");
    }
    public void start(){
        System.out.println("Starting...");
    }
}

