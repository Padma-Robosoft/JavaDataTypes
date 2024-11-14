package Task10.Problem2;

public class Sleeper implements Runnable{

    public void run(){
        try{
            System.out.println(Thread.currentThread().getName() +" is about to sleep");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+ " woke up after sleeping");
        }
        catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " was interrupted during sleep");
            Thread.currentThread().interrupt();
        }
    }
}
