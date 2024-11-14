package Task10.Problem1;

public class ReadWriteLock {

    private int readers = 0;
    private int writers = 0;
    private int waitingWriters = 0;

    public synchronized void acquireReadLock() throws InterruptedException {
        while (writers > 0 || waitingWriters > 0) {
            wait();
        }
        readers++;
    }

    public synchronized void releaseReadLock() {
        readers--;
        if (readers == 0) {
            notifyAll();
        }
    }

    public synchronized void acquireWriteLock() throws InterruptedException {
        waitingWriters++;
        try {
            while (readers > 0 || writers > 0) {
                wait();
            }
            writers++;
        } finally {
            waitingWriters--;
        }
    }

    public synchronized void releaseWriteLock() {
        writers--;
        notifyAll();
    }
}
