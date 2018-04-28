package multiThreading;

class WaitNotifyTest1 implements Runnable{
	public void run(){
		for(int i=0; i<10; i++){
			long threadId = Thread.currentThread().getId();
			System.out.println(Thread.currentThread().getName());
			if(Thread.currentThread().getName() == "FirstThread"){
				try{
					Thread.currentThread().getName().wait();
					
				}
				catch(Exception e){
					System.out.println("Exception");
				}
			}
			System.out.println(threadId);
		}
	}
}

public class WaitNotifyTest {

	public static void main(String[] args) {
		WaitNotifyTest1 r1 = new WaitNotifyTest1();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.setName("FirstThread");
		t2.setName("Secondthread");
		t1.start();
		t2.start();
	}

}
