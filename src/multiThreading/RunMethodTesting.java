package multiThreading;

public class RunMethodTesting extends Thread{
	
	public void run(){
		System.out.println("run");
	}

	public static void main(String[] args) {
		RunMethodTesting runMethodTesting = new RunMethodTesting();
		runMethodTesting.start();
		System.out.println("gape");
		runMethodTesting.run();
	}

}
