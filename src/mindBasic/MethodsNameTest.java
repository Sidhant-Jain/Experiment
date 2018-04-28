package mindBasic;

public class MethodsNameTest extends Thread{

	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<10; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				
			}
			System.out.println(i);
		}
		System.out.println("run");
	}
	
	public static void main(String[] args) {
		MethodsNameTest mnt1 = new MethodsNameTest();
		MethodsNameTest mnt2 = new MethodsNameTest();
		MethodsNameTest mnt3 = new MethodsNameTest();
		mnt1.start();
		
		try{
			mnt1.join();
		}
		catch(Exception ie){
			
		}
		
		mnt2.start();
		
		try{
			mnt2.join();
		}
		catch(Exception ie){
			
		}
		mnt3.start();
		
		mnt1.setName("rahul");
		
		System.out.println("thread name: "+mnt1.getName());
	}

}
