/*package whatever //do not write package name here */

import java.util.concurrent.*;

class GFG {
	public static void main(String[] args) throws Exception
	{
		CompletableFuture<String> helloFuture
				= CompletableFuture.supplyAsync(() -> "Hello");
		CompletableFuture<String> greetingFuture
				= CompletableFuture.supplyAsync(() -> "World");

		CompletableFuture<String> combinedFuture
				= helloFuture.thenCombine(
				greetingFuture, (m2, m1) -> m1 + " " + m2);

		System.out.println(combinedFuture.get());
	}
}
