package Task10.Problem1;

public class Main {
    public static void main(String[] args) {
        ReadWriteLock lock = new ReadWriteLock();

        Writer writer = new Writer(lock, "Writer");
        writer.start();

        Reader reader1 = new Reader(lock, "Reader 1");
        Reader reader2 = new Reader(lock, "Reader 2");

        System.out.println("Readers are waiting...");

        reader1.start();
        reader2.start();

        try {
            writer.join();
            reader1.join();
            reader2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Main thread was interrupted.");
        }
    }
}

