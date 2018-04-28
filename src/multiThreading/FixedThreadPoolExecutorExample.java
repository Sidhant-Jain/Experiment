package multiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FixedThreadPoolExecutorExample {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		for(int i=0; i<5; i++){
			Task task = new Task("Task " + i);
			System.out.println("A task new added " + task.getName());
			executor.execute(task);
		}
		System.out.println("max thread inside pool : " + executor.getMaximumPoolSize());
		executor.shutdown();
	}

}
