package designPattern;

public class SingletonTest {
	private static SingletonTest singletonTest;
	
	private SingletonTest(){
		System.out.println("singletone test");
	}
	
	public static SingletonTest getConnect(){
		if(singletonTest==null){
			synchronized (SingletonTest.class) {
				if(singletonTest == null){
					singletonTest = new SingletonTest();
				}
				System.out.println("st syn test");
			}
		}		
		return singletonTest;
	}
	
	public static void test(){
		System.out.println("test out");
	}
}