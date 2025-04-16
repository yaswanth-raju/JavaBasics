package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(()->{
            Thread.currentThread().setName("Thread-1");

        });
        // Submit Runnable tasks
        executorService.execute(() -> {
            System.out.println("Executing task 1");
        });

        executorService.execute(() -> {
            System.out.println("Executing task 2");
        });

        // Submit Callable tasks and get Future objects
        Future<Integer> future1 = executorService.submit(() -> {
            System.out.println("Executing task 3");
            return 3;
        });

        Future<Integer> future2 = executorService.submit(() -> {
            System.out.println("Executing task 4");
            return 4;
        });

        try {
            // Retrieve results from Future objects
            Integer result1 = future1.get();
            Integer result2 = future2.get();
            System.out.println("Result of task 3: " + result1);
            System.out.println("Result of task 4: " + result2);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shut down the ExecutorService
        executorService.shutdown();
    }
}
