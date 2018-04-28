package arrayProblem;

public class UnInitializedArrays {

	int[] a;
	
	int x;
	static int y;
	
	public static void main(String[] args) {
		UnInitializedArrays uia = new UnInitializedArrays();
		int z;
//		System.out.println(uia.a);
//		System.out.println(uia.a[0]);
		System.out.println(uia.x);
		System.out.println(y);
//		System.out.println(z); // local variable should be initialized first
	}
	

}
