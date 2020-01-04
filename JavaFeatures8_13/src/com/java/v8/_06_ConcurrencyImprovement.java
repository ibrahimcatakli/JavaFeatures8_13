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

		executor.shutdown(); // executor �zerinde bir task var ise onu bitirmesini bekler.
		//executor.shutdownNow(); // executor �zerinde bir task�n olup olmad��na bakmaks�z�n stop eder.
		//executor.awaitTermination(5, TimeUnit.SECONDS); // executor'�n 5 sn sonra kapanmas�n� sa�lar.
	}

}
