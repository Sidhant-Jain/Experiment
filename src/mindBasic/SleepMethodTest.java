package mindBasic;

public class SleepMethodTest extends Thread{

	public void run(){
		for(int i=0; i<10; i++){
			try{
				Thread.sleep(2000);
				
			}
			catch(InterruptedException e){
				System.out.println("e");
			}
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		SleepMethodTest smt1 = new SleepMethodTest();
		SleepMethodTest smt2 = new SleepMethodTest();
		Hello h1 = new Hello();
		h1.run();
		smt1.start();
		System.out.println("slep1");
		smt1.start();
		System.out.println("sleep2");
		
		
		for(int i =0; i<10; i++)
		System.out.println("main");
	}

}


class Hello extends Thread{
	public void run(){
		for(int i=10; i<20; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				System.out.println("catch 2");
			}
			System.out.println(i);
		}
	}
}