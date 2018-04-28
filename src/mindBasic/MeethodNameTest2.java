package mindBasic;

public class MeethodNameTest2 extends Thread{
	public void run(){
		System.out.println("running thread name is: " + Thread.currentThread().getName());
		System.out.println("runing trd priority is: " + Thread.currentThread().getPriority());
		for(int i=0; i<10; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		MeethodNameTest2 mnt1 = new MeethodNameTest2();
		MeethodNameTest2 mnt2 = new MeethodNameTest2();
		
		mnt2.setName("rahul");
		mnt1.setPriority(MIN_PRIORITY);
		mnt2.setPriority(MAX_PRIORITY);
		mnt1.start();
		mnt2.start();
	}

}
