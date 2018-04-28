package multiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecution {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(10);
		for(int i=0; i<5; i++){
			TaskPerformer taskPerformer = new TaskPerformer("task" + i);
			System.out.println("new task name : " + taskPerformer.getName());
			executor.execute(taskPerformer);
		}
		executor.shutdown();
	}
		
}
