package Task10.Problem3;

public class ThreadPoolTask implements Runnable{
    private int taskID;

    public ThreadPoolTask(int taskID){
        this.taskID=taskID;
    }

    @Override
    public void run() {
        try{
            System.out.println("ThreadPoolTask "+taskID+" Starting");
            Thread.sleep(1000);
            System.out.println("ThreadPoolTask "+taskID+" Completed");
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Task "+taskID+ " was Interrupted");
        }
    }
}
