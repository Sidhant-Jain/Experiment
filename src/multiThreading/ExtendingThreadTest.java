package multiThreading;

class MyThreadTest extends Thread{
	@Override 
	public void run(){
		for(int i=0; i<10; i++){
			//System.out.println(i);
			Thread t = Thread.currentThread();
			String name = t.getName();
			System.out.println(name + i);
		}
	}
}

public class ExtendingThreadTest {

	public static void main(String [] args){
		method1();
		
	}
	
	public static void method1(){
		MyThreadTest mt = new MyThreadTest();
	//	Thread t1 = new Thread();
		mt.start();
//		Thread t2 = new Thread(mt);
//		t2.start();
	}
}
