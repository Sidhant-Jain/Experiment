package mindBasic;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c ='A';
		char c1 = 'a';
		char c2 = 'A';
		String str ="abc" , temp1 = " ", temp2 = "";
		if(temp1.equals(temp2)){
			
			System.out.println("temp");
		}
		else{
			System.out.println("temp not");
		}
		
		System.out.println(str);
		if(c==c2){
			System.out.println("true");
			str = str.replace(c1, ' ');
			System.out.println(str);
		}
		else{
			System.out.println("false");
		}
	}

}
