package Task10.Problem4;

import java.util.concurrent.CountDownLatch;

public class WorkerThread extends Thread{
    private CountDownLatch latch;

    public WorkerThread(CountDownLatch latch){
        this.latch=latch;
    }

    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+ " its Working");
            Thread.sleep((long)(Math.random()*1000));
            System.out.println(Thread.currentThread().getName()+ " has Finished work");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        finally {
            latch.countDown();
        }
    }

}
