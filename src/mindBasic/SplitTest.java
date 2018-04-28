package mindBasic;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "i am sidhant jain";
		
		String a[] = str.split(" ");
		System.out.println(a.length);
		for(int i=0; i<a.length; i++){
			System.out.println(i);
			System.out.println(a[i]);			
		}


	}

}
