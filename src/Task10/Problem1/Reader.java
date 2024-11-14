package Task10.Problem1;

public class Reader extends Thread{
    private final ReadWriteLock lock;

    public Reader(ReadWriteLock lock, String name) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.acquireReadLock();
            System.out.println(Thread.currentThread().getName() + " is reading.");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " has finished reading.");
            lock.releaseReadLock();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

