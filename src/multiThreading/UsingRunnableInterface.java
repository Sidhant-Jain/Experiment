package multiThreading;

class RunnableExtends implements Runnable{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("run");
		}
	}
}

public class UsingRunnableInterface {
	
	public static void main(String[] args) {
		RunnableExtends re = new RunnableExtends();
		//re.start(); // cte 
		//re.run(); // ne
		Thread t = new Thread(re);
		t.start();
	}
//	Thread t = new Thread(re);
//	t.start();
//	t.run();
}
