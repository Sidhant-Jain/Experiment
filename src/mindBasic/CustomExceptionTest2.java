package mindBasic;

public class CustomExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			validate(10);
			System.out.println("try");
			
		}
		catch(InvalidAge e){
			System.out.println("Invalid Age");
		}
		catch(Exception e){
			System.out.println("catch");
		}
	}
	
	static void validate(int age) throws InvalidAge{
		System.out.println("validate");
		if(age<18){
			throw new InvalidAge("not valid");
		}
		else{
			System.out.println("nothing");
		}


	}

}
