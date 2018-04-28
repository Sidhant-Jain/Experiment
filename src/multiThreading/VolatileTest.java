package multiThreading;

class VolatileTestImpl implements Runnable{
	static volatile int sharedVar=10;
	public void run(){
		sharedVar= sharedVar+1;
		System.out.println(sharedVar);
	}
}


public class VolatileTest {

	public static void main(String[] args) {
		VolatileTestImpl r1 = new VolatileTestImpl();
		VolatileTestImpl r2 = new VolatileTestImpl();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
