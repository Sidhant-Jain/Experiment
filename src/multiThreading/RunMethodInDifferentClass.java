package multiThreading;

class RunMethodInDifferentClassMain extends Thread{
	public void run(int x){
		for(int i=0; i<10; i++){
			System.out.println("run");
		}
	}	
}

class RunMethodInDifferentClass {

	public static void main(String[] args){
		RunMethodInDifferentClassMain runMethodInDifferentClassMain = new RunMethodInDifferentClassMain();
		runMethodInDifferentClassMain.start();
		for(int i=0; i<10; i++){
			System.out.println("main");
		}
		runMethodInDifferentClassMain.run(1);
	}
}