package mindBasic;

public class DemonThreadTest extends Thread{
	
		public void run(){
			if(Thread.currentThread().isDaemon()){
				System.out.println("demon");
			}
			else
			System.out.println("not demon");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemonThreadTest dtt1 = new DemonThreadTest();
		DemonThreadTest dtt2 = new DemonThreadTest();
		DemonThreadTest dtt3 = new DemonThreadTest();
		dtt1.setDaemon(true);
		dtt1.start();
		dtt2.start();
		dtt3.start();
		
		
	}

}
