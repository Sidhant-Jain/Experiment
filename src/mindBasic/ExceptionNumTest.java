package mindBasic;

public class ExceptionNumTest {

	public static void main(String[] args) {
		int str = 0;
		boolean b = true;
		
	try{
		
		str = Integer.parseInt("1=W:2=Z");
		
		
	}
	catch(NumberFormatException e){
		b = false;
		System.out.println(str);
		System.out.println(b);
	}
	}

}
