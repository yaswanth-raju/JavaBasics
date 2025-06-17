package threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ComletableFutureExample1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("completeable future");

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, World!";
        });

        future.thenAccept(result -> {
            System.out.println(result);
        });

        future.get();
        System.out.println("completeable future end");

    }
}
