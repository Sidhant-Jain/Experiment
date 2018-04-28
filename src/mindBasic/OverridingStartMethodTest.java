package mindBasic;

class MyThread1 extends Thread{
	public void run(){
		System.out.println("run");
	}
	
	public void start(){
		super.start();
				System.out.println("supr Start");
	}
	
}

public class OverridingStartMethodTest {
	public static void main(String[] args){
	MyThread1 mt = new MyThread1();
	mt.start();
		mt.start();
		//OverridingTest ot = new OverridingTest();
		//ot.start();
		System.out.println("main");
	}
}

class OverridingTest extends MyThread1{
	public void run(){
		System.out.println("run1");
	}
	public void start(){
		super.start();
		//		System.out.println("start");
	}
}
