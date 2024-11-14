package Task10.Problem4;

import java.util.concurrent.CountDownLatch;

public class MyCountDownLatchMain {
    public static void main(String[] args) {
        int numberOfWorkers=5;
        CountDownLatch latch =new CountDownLatch(numberOfWorkers);

        for(int i=0;i<numberOfWorkers;i++){
            new WorkerThread(latch).start();
        }
        try {
            latch.await();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("All Workers have finished, proceeding with the main thread ");
    }
}
