package mindBasic;

class MyThread extends Thread{
	public void run(){
		for(int i =0; i<10; i++){
			System.out.println("my thread");
		}
	}
	
	public void run(int i, int j){
		System.out.println("argument");
	}
	public void start(){
		for(int i=0; i<10; i++){
			System.out.println("mt start");
			
		}
	}
	
}

public class ThreadCase1Test {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		for(int i = 0; i<10; i++){
			System.out.println("main");
		}
	}
	
	static void start(){
		System.out.println("start");
	}

}