package multiThreading;

class Work implements Runnable{
	private int max;
	private boolean isEven;
	
	public void run(){
		System.out.println("reached");
		int number = isEven == true ? 2 :1;
		
		while(number<max){
			if(isEven){
				print(number);
			}
			else{
				print(number);
			}
			number=number+2;
		}
	}
	
	
	Work(int max, boolean isEven){
		this.max=max;
		this.isEven=isEven;
	}
	
	synchronized void printOdd(int number){
		
	}
	
	synchronized void printEven(int number){
		System.out.println();
	}
	
	synchronized void print(int number){
		System.out.println(number);
	}
}



public class PrintEvenOdd {

	public static void main(String[] args) {
		System.out.println("start");
		Thread t1= new Thread(new Work(10, false));
		Thread t2= new Thread(new Work(10, true));
		t1.start();
		t2.start();		
	}

}
