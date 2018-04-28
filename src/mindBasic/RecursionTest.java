package mindBasic;

public class RecursionTest {

	public static void main(String[] args) {
		m1(0);
	}
	
	static void m1(int i){
		if(i<10){
			System.out.println("hello world");
			i++;
			m1(i);
		}
	}

}
