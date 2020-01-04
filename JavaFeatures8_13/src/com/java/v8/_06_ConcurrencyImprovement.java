package com.java.v8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _06_ConcurrencyImprovement {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		});

		// => Hello pool-1-thread-1

		executor.shutdown(); // executor üzerinde bir task var ise onu bitirmesini bekler.
		//executor.shutdownNow(); // executor üzerinde bir taskýn olup olmadýðna bakmaksýzýn stop eder.
		//executor.awaitTermination(5, TimeUnit.SECONDS); // executor'ýn 5 sn sonra kapanmasýný saðlar.
	}

}
