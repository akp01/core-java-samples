/**
 * 
 */
package com.akp.cp.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author akp
 *
 */
public class CachedThreadPoolExecutorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;

		ExecutorService executor = Executors.newCachedThreadPool();
		executor.submit(new Task1(++count));
		executor.submit(new Task2(++count));
		executor.submit(new Task1(++count));
		executor.submit(new Task3(++count));
		executor.submit(new Task2(++count));
		executor.submit(new Task1(++count));
		executor.submit(new Task2(++count));
		executor.submit(new Task3(++count));
		executor.shutdown();
	}

}
