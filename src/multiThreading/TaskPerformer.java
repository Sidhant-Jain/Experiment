package multiThreading;

public class TaskPerformer implements Runnable{
	
	String name;

	TaskPerformer(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public void run(){
		try{
			System.out.println("processing : " + name);
			int i=2, j=3;
			test();
			int k = test1(i,j);
			System.out.println(k);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void test(){
		System.out.println("test : " + name);
		System.out.println("reached");
	}
	
	public int test1(int i, int j){
		System.out.println("test1 : " + name);
		return i+j;
	}
}
