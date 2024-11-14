package Task10.Problem2;

public class ThreadInteruption {
    public static void main(String[] args) {
        Sleeper sleeperRunnable = new Sleeper();
        Thread sleeperThread = new Thread(sleeperRunnable);
        sleeperThread.start();

        Thread thread2=new Thread(new Runnable () {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+ " is interrupting the sleeper thread");
                    sleeperThread.interrupt();
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
        });
        thread2.start();
    }
}
