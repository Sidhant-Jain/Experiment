package exceptionHandling;

public class DefaultEHTest {

	public static void main(String[] args) {
		doStuf();
	}
	
	public static void doStuf(){
		doMoreStuf();
	}
	
	public static void doMoreStuf(){
		int c = 10/0;
	}
}
