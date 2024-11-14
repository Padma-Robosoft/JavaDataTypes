package Task10.Problem1;

public class Writer extends Thread{
    private final ReadWriteLock lock;

    public Writer(ReadWriteLock lock, String name) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.acquireWriteLock();
            System.out.println(Thread.currentThread().getName() + " is writing.");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " has finished writing.");
            lock.releaseWriteLock();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

