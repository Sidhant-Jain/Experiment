package multiThreading;

class MyNewThread {
	public void run(){
		System.out.println("run");
	}
}

public class WithoutExtendThread {
	public static void main(String[] args) {
		MyNewThread mnt = new MyNewThread();
	//	mnt.start(); Compile time error
		mnt.run(); // it excute as a normal method
	
	}
}
