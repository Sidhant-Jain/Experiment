package multiThreading;

class MyThread extends Thread{
//	public void start(){
//		super.start();
//		System.out.println("start");
//	}
//	
	public void run(){
		super.start();
		System.out.println("run");
	}
}


public class OverridingStartTest {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.start();
		System.out.println("main");
//		t.run();
	}

}
