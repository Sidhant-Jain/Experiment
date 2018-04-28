package multiThreading;

class RunThread implements Runnable{
	int size=10;
	boolean isEvenOdd=false;
	public void run(){
		for(int i=1; i<size; i++){
		
			if(isEvenOdd){
				printOdd(i);
			}
			else{
				printEven(i);
			}
		}	
	}
	
	RunThread(int size, boolean isEvenOdd){
		this.size=size;
		this.isEvenOdd=isEvenOdd;
	}
	
	synchronized void printOdd(int num){
		try{
			wait();
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println(num);
		notifyAll();
	}
	
	synchronized void printEven(int num){
		try{
			wait();
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println(num);
		notifyAll();
	}
	
}

public class MultipleThreads {
	public static void main(String [] args){
		Thread t1 = new Thread(new RunThread(10,false));
		Thread t2 = new Thread(new RunThread(10,true));
		
		t1.start();
		t2.start();
		
	}
}
