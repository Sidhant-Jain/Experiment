package mindBasic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	
	String msg;
	WorkerThread(String  s){
		this.msg=s;
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName() + "(start msg :)" + msg);
		processMsg();
		System.out.println(Thread.currentThread().getName() + " end msg: " );
	}
	
	public void processMsg(){
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
}

public class PoolThreadTest {

	public static void main(String[] args) {
		ExecutorService excuter = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i<10; i++){
			Runnable worker = new WorkerThread("hh " +i);
			excuter.execute(worker);
		}
		excuter.shutdown();
		
		while(!excuter.isTerminated()){
		//	System.out.println("no");
		}
		System.out.println("inish");
	}

}
