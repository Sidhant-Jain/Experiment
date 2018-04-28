package multiThreading;

class MyRunnable implements Runnable{
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("print : " + Thread.currentThread().getName());
		}
	}
}

public class RunWithoutStart {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		//Thread t1  = new Thread(myRunnable);
		for(int i=0; i<5; i++){
			Thread t1  = new Thread(myRunnable);
			t1.run();
		}
//		for(int i=0; i<2; i++){
//			Thread t1  = new Thread(myRunnable);
//			t1.start();
//		}
	}

}
