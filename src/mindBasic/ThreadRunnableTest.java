package mindBasic;



public class ThreadRunnableTest implements Runnable{

	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("thread");
		}
	}
	
//	public void start(){
//		for(int i=0; i<10; i++){
//			System.out.println("start");
//			
//		}
//	}
	
	public static void main(String[] args) {
		ThreadRunnableTest trt = new ThreadRunnableTest();
		Thread t1 = new Thread(trt);
//		for(int i=0; i<10; i++){
//			System.out.println("main1");
//		}
//		trt.run();
		t1.start();
//		for(int i=0; i<10;i++){
//			System.out.println("main");
//		}
	}

}
