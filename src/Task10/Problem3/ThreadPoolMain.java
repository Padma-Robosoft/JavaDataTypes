package Task10.Problem3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolMain {
    public static void main(String[] args) {
        int numOfThreads = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numOfThreads);

        for (int i = 0; i < 15; i++) {
            executorService.submit(new ThreadPoolTask(i));
        }
        executorService.shutdown();

        try {
            if (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdown();
        }
    }
}
