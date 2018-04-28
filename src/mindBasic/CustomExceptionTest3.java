package mindBasic;

public class CustomExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			validate(10);
			System.out.println("hh");
		}
		catch(InvalidAge1 ia){
		System.out.println("iii");	
		}
		catch(Exception e){
			System.out.println("ex");
		}

	}
	
	static void validate(int age) throws InvalidAge1{
		System.out.println("bhjbj");
		if(age<18){
			throw new InvalidAge1("not valid");
		}else{
			System.out.println("nothing");
		}
	}

}

class InvalidAge1 extends Exception{
	InvalidAge1(String s){
		super(s);
		System.out.println("Invalid1");
	}
}
