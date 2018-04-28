package multiThreading;


class RunnableJoin implements Runnable{
	public void run(){
		for(int i=0; i<2; i++){
			try{
				Thread.sleep(500);
				System.out.println("Current thread for loop : " + Thread.currentThread().getName());
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

public class JoinTest {

	public static void main(String[] args) {
		RunnableJoin runnableJoin = new RunnableJoin();
		Thread t1 = new Thread(runnableJoin);
		Thread t2 = new Thread(runnableJoin);
		Thread t3 = new Thread(runnableJoin);
		Thread t4 = new Thread(runnableJoin);
		
		t1.start();
		
		try{
			System.out.println("Current Thread t1 try : " + Thread.currentThread().getName());
			t1.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		t2.start();
		
		try{
			
			System.out.println("Current Thread T2 try : " + Thread.currentThread().getName());
			t2.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		t3.start();
		
		try{
			System.out.println("Current Thread t3 try : " + Thread.currentThread().getName());
			t3.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		t4.start();
		
		try{
			
			System.out.println("Current thread t4 try : " + Thread.currentThread().getName());
			t4.join();
		}
		catch(Exception e){
			
		}
	}

}
